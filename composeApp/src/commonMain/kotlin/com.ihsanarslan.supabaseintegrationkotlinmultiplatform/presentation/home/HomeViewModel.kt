package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ihsanarslan.supabaseintegrationkotlinmultiplatform.domain.model.Post
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.postgrest
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val supabaseClient: SupabaseClient) : ViewModel() {

    private val _listOfPosts = MutableStateFlow<List<Post>>(emptyList())
    val listOfPosts: StateFlow<List<Post>>
        get() = _listOfPosts.asStateFlow()


    init {
        getPosts()
    }

    fun getPosts() {
        viewModelScope.launch {
            _listOfPosts.value = supabaseClient
                .from("postss")
                .select()
                .decodeList<Post>()
        }
    }


    fun addPost() {
        viewModelScope.launch {
            val post = Post(title = "The Shire", content = "sgsgasg")
            supabaseClient.from("postss").insert(post)
        }
    }



}