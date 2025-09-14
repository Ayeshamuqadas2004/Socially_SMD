package com.AyeshaMuqadas.i221153

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryUploadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.photocamera) // your story screen XML

        // Back to Home when clicking settings or back (optional)
        val settingsIcon = findViewById<ImageView>(R.id.settingsIcon)
        settingsIcon.setOnClickListener {
            finish()
        }

        val nextIcon = findViewById<ImageView>(R.id.nextIcon)
        nextIcon.setOnClickListener {
            // For now just close or later move to "Share Story" screen
            finish()
        }
    }
}
