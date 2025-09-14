package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class YouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you) // You will create this XML similar to Following

        val followingTab = findViewById<TextView>(R.id.followingTab)
        val youTab = findViewById<TextView>(R.id.youTab)

        // Clicking "Following" tab → go back
        followingTab.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
