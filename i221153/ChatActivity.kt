package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val videoCallBtn = findViewById<ImageView>(R.id.videoCall)
        videoCallBtn.setOnClickListener {
            val intent = Intent(this, VideoCallActivity::class.java)
            intent.putExtra("username", "joshua_l") // pass current chat username
            startActivity(intent)
        }

        val search = findViewById<ImageView>(R.id.nav_search)
        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        val heartIcon = findViewById<ImageView>(R.id.nav_heart1) // replace with actual id
        heartIcon.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
        }

        val createIcon = findViewById<ImageView>(R.id.nav_explore1)
        createIcon.setOnClickListener {
            val intent = Intent(this, StoryUploadActivity::class.java)
            startActivity(intent)
        }

        val profileIcon = findViewById<ImageView>(R.id.nav_profile3)
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
