package com.ingoo.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager
import com.ingoo.R
import kotlinx.android.synthetic.main.activity_ninth.*
import kotlinx.android.synthetic.main.activity_tenth.*

class NinthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mScreenWidth = windowManager.defaultDisplay.width
        val mScreenHeight = windowManager.defaultDisplay.height
        val view = layoutInflater.inflate(R.layout.activity_ninth, null)
        setContentView(view, ViewGroup.LayoutParams(mScreenWidth, mScreenHeight))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        cardView2022.setOnClickListener {
            startActivity(Intent(this,TenthActivity::class.java))
        }
        rlItems?.setOnClickListener {
            startActivity(Intent(this,TenthActivity::class.java))
        }
    }
}