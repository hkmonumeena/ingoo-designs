package com.ingoo.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager
import com.ingoo.R
import kotlinx.android.synthetic.main.activity_thirteen.*

class ThirteenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mScreenWidth = windowManager.defaultDisplay.width
        val mScreenHeight = windowManager.defaultDisplay.height
        val view = layoutInflater.inflate(R.layout.activity_thirteen, null)
        setContentView(view, ViewGroup.LayoutParams(mScreenWidth, mScreenHeight))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        constraintLayoutHeader.setOnClickListener { startActivity(Intent(this,FourteenthActivity::class.java)) }
        ll.setOnClickListener { startActivity(Intent(this,FourteenthActivity::class.java)) }
    }
}