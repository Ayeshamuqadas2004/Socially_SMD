package com.AyeshaMuqadas.i221153

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search) // <-- the layout we made
        val home = findViewById<ImageView>(R.id.nav_home)
        home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val search = findViewById<ImageView>(R.id.nav_search)

    }
}
