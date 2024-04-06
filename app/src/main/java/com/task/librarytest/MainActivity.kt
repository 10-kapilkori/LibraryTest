package com.task.librarytest

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.task.picassolibrarycreation.GenerateImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GenerateImage.loadImage(
            this,
            "https://as2.ftcdn.net/v2/jpg/07/58/90/05/1000_F_758900564_Whn4QmKA83An0SFaq2aBA4ek0ZNpeGeU.jpg",
            findViewById<ImageView>(R.id.iv)
        )
    }
}