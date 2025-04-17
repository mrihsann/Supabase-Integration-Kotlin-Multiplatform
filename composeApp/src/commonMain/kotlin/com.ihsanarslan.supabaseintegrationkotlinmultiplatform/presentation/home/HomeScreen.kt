package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(){

    val viewModel = koinViewModel<HomeViewModel>()
    val posts = viewModel.listOfPosts.collectAsState()

    Box(modifier = Modifier.fillMaxSize().padding(30.dp).background(Color.Red)) {
        LazyColumn {
            items(posts.value.size) { index ->
                Text(
                    text = posts.value[index].title,
                    modifier = Modifier.padding(8.dp),
                )
                Text(
                    text = posts.value[index].content,
                    modifier = Modifier.padding(8.dp),
                )
            }
            item {
                Button(onClick = { viewModel.addPost() }) {
                    Text(text = "Add Post")
                }
            }
        }
    }

}