package com.example.spotjobs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ktx.database
//import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


class Post_job : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_job)
    }

    fun sendJob(jobTitle: String, jobDesc: String, jobLength: String, jobPay: Float, jobPoster: String) {
        val db = Firebase.database.reference

        //Declaring the job object to send
        val job = object {
            var job_desc: String = jobDesc
            var job_length: String = jobLength
            var job_pay: Float = jobPay
            var job_poster: String = jobPoster
        }
        //Note to self. Useing setValue(NULL) will erase a job.
        db.child("jobs").child("jobTitle").setValue(job)
    }
}