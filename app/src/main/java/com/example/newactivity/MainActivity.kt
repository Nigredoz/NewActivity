package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pic_button: Button = findViewById(R.id.btn_show_pic)
        pic_button.setOnClickListener {
            val intent: Intent = Intent(this, PicActivity::class.java)
            val picLink: String = "https://zamanilka.ru/wp-content/uploads/2020/12/vertikal-visokoe-kachestvo-1080x2340-3.jpg"
            intent.putExtra("link", picLink)
            startActivity(intent)
        }
    }
}