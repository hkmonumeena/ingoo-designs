package com.ingoo.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ingoo.R

class LoginActivity : AppCompatActivity() {
    var rlconnexion: RelativeLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // In Activity's onCreate() for instance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }



        rlconnexion = findViewById(R.id.rlconnexion)
        val textViewMotDePasseOblie = findViewById<TextView>(R.id.textViewMotDePasseOblie)
        val textViewCreteAcnt = findViewById<TextView>(R.id.textViewCreteAcnt)
        rlconnexion?.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    ThirdActivity::class.java
                )
            )
        })
        textViewMotDePasseOblie.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    ThirdActivity::class.java
                )
            )
        }
        textViewCreteAcnt.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    SignupActivity::class.java
                )
            )
        }
    }
}