package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.AyeshaMuqadas.i221153.R

class MessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        // Example: open chat when clicking profilePic1 row
        val profile1 = findViewById<ImageView>(R.id.profilePic1)
        profile1.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("username", "joshua_l") // send username
            startActivity(intent)
        }

        val profile2 = findViewById<ImageView>(R.id.profilePic2)
        profile2.setOnClickListener {
            val intent = Intent(
                this,
                ChatActivity::class.java
            )
            intent.putExtra("username", "andrew_k")
            startActivity(intent)
        }

        // repeat for profilePic3, 4, etc.
    }
}
