package com.example.spotjobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Find_job : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_job)
    }

    fun searchJob() {
        //val db = Firebase.database.reference

        val db = FirebaseDatabase.getInstance().getReference("jobs")
        val jobTitle = ""
        val job = object {
            val jobDesc: String = ""
            val jobLength: String = ""
            val jobPay = 0.0
            val jobPoster: String = ""
        }
    }
}