package com.example.spotjobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun postJob(view: View){
        val intent :Intent = Intent(this,Post_job::class.java)
        startActivity(intent)
    }
    fun findJob(view: View){
        val intent :Intent = Intent(this,Find_job::class.java)
        startActivity(intent)
    }
}