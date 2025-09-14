package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val search = findViewById<ImageView>(R.id.nav_search)
        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        val messageIcon = findViewById<ImageView>(R.id.messageIcon)
        messageIcon.setOnClickListener {
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }

        val heartIcon = findViewById<ImageView>(R.id.nav_heart1) // replace with actual id
        heartIcon.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
        }

        val cameraIcon = findViewById<ImageView>(R.id.cameraIcon)
        cameraIcon.setOnClickListener {
            val intent = Intent(this, StoryUploadActivity::class.java)
            startActivity(intent)
        }

        val createIcon = findViewById<ImageView>(R.id.nav_explore1)
        createIcon.setOnClickListener {
            val intent = Intent(this, StoryUploadActivity::class.java)
            startActivity(intent)
        }

        val profileIcon = findViewById<ImageView>(R.id.nav_profile)
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val homeIcon = findViewById<ImageView>(R.id.nav_home1)
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

