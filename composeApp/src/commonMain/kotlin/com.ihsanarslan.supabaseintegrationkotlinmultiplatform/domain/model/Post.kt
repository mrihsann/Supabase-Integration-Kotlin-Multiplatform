package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(val title: String, val content: String)