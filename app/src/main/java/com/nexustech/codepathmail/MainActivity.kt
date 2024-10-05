package com.nexustech.codepathmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: EmailAdapter
    private val emails = EmailFetcher.getEmails()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the RecyclerView and Load More button
        val recyclerView = findViewById<RecyclerView>(R.id.emailsRv)
        val loadMoreButton = findViewById<Button>(R.id.loadMoreButton)

        // Set up the adapter and RecyclerView
        adapter = EmailAdapter(emails)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Load More button logic
        loadMoreButton.setOnClickListener {
            val moreEmails = EmailFetcher.getNext5Emails() // Assuming a method that fetches the next 5 emails
            emails.addAll(moreEmails) // Add more emails to the list
            adapter.notifyDataSetChanged() // Notify the adapter about the data change
        }
    }
}
