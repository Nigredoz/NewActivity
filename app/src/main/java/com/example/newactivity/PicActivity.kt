package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_layout)
        this.setTitle("Фото")

        val intent: Intent = getIntent()
        val message: String = intent.getStringExtra("link").toString()
        val image: ImageView = findViewById(R.id.picView)
        val url = message

        Glide.with(this).load(url).into(image)
    }
}