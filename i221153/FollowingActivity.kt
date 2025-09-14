package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FollowingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_following) // XML you pasted

        val followingTab = findViewById<TextView>(R.id.followingTab)
        val youTab = findViewById<TextView>(R.id.youTab)

        // Clicking "You" tab → open YouActivity
        youTab.setOnClickListener {
            val intent = Intent(this, YouActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
