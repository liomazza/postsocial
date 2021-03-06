package com.example.lio.postsocial.data.entities

import com.google.firebase.firestore.Exclude
import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
data class Post(
    val id: String = "",
    val authorUid: String = "",
    @get:Exclude var authorUserName: String = "",
    @get:Exclude var authorProfilePictureUrl: String = "",
    val text: String = "",
    val imageUrl: String = "",
    val date: Long = 0L,
    @get:Exclude var isLiked : Boolean = false,
    @get:Exclude var isLiking: Boolean = false,
    var likedBy: List<String> = listOf()
)