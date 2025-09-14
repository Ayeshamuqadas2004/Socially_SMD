package com.AyeshaMuqadas.i221153

import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)

        val postsTab = findViewById<ImageView>(R.id.postsTab)
        val tagsTab = findViewById<ImageView>(R.id.tagsTab)
        val postsGrid = findViewById<GridLayout>(R.id.postsGrid)
        val tagsGrid = findViewById<GridLayout>(R.id.tagsGrid)

        postsTab.setOnClickListener {
            postsGrid.visibility = View.VISIBLE
            tagsGrid.visibility = View.GONE
        }

        tagsTab.setOnClickListener {
            tagsGrid.visibility = View.VISIBLE
            postsGrid.visibility = View.GONE
        }
    }
}
