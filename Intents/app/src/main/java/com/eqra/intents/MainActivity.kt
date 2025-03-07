package com.eqra.intents

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var sendEmailBtn : Button
    private lateinit var openMapBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendEmailBtn = findViewById<Button>(R.id.sendEmail)
        sendEmailBtn.setOnClickListener {
            val it = Intent(this, send_email::class.java)
        }
        openMapBtn = findViewById(R.id.btnGglMap)
        openMapBtn.setOnClickListener {
            val mapAct = Intent(this, google_map::class.java)
        }
    }
}
