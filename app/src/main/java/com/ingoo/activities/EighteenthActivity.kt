package com.ingoo.activities


import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.ingoo.R
import kotlinx.android.synthetic.main.activity_eighteenth.*
import kotlinx.android.synthetic.main.activity_eighteenth.rlHeader
import kotlinx.android.synthetic.main.activity_eighteenth.tv
import kotlinx.android.synthetic.main.activity_seventeeth.*

class EighteenthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mScreenWidth = windowManager.defaultDisplay.width
        val mScreenHeight = windowManager.defaultDisplay.height
        val view = layoutInflater.inflate(R.layout.activity_eighteenth, null)
        setContentView(view, ViewGroup.LayoutParams(mScreenWidth, mScreenHeight))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        rlHeader.setOnClickListener { startActivity(Intent(this,NineteethActivity::class.java)) }
    }
}