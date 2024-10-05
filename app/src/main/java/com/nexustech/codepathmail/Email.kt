package com.nexustech.codepathmail

class Email(
    val sender: String,
    val title: String,
    val summary: String,
    val senderImage: Int, // For sender's profile picture (using drawable resource IDs)
    val date: String,
    val isRead: Boolean // To check if the email is read or unread
)

