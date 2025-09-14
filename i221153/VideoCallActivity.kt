package com.AyeshaMuqadas.i221153

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VideoCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videocallactivity)

        // Get username from ChatActivity
        val username = intent.getStringExtra("username")
        val nameView = findViewById<TextView>(R.id.videoCallName)
        nameView.text = username ?: "Unknown"
    }
}
