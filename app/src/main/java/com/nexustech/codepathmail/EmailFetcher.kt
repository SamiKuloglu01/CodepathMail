package com.nexustech.codepathmail

class EmailFetcher {
    companion object {
        val senders = listOf(
            "Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes",
            "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval",
            "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould"
        )

        val senderImages = listOf(
            R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder,
            R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder,
            R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder,
            R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder,
            R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder, R.drawable.ic_profile_placeholder
        )

        val dates = listOf(
            "Oct 1, 2024", "Sep 30, 2024", "Sep 29, 2024", "Sep 28, 2024", "Sep 27, 2024",
            "Sep 26, 2024", "Sep 25, 2024", "Sep 24, 2024", "Sep 23, 2024", "Sep 22, 2024",
            "Sep 21, 2024", "Sep 20, 2024", "Sep 19, 2024", "Sep 18, 2024", "Sep 17, 2024"
        )

        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."

        fun getEmails(): MutableList<Email> {
            val emails: MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(
                    senders[i],
                    title,
                    summary,
                    senderImages[i],
                    dates[i],
                    isRead = i % 2 == 0
                )
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val newEmails: MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(
                    senders[i],
                    title,
                    summary,
                    senderImages[i],
                    dates[i],
                    isRead = i % 2 == 0
                )
                newEmails.add(email)
            }
            return newEmails
        }
    }
}
