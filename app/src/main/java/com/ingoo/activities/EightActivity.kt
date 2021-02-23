package com.ingoo.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.ingoo.R
import kotlinx.android.synthetic.main.activity_eight.*

class EightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mScreenWidth = windowManager.defaultDisplay.width
        val mScreenHeight = windowManager.defaultDisplay.height
        val view = layoutInflater.inflate(R.layout.activity_eight, null)
        setContentView(view, ViewGroup.LayoutParams(mScreenWidth, mScreenHeight))

         View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        View.SYSTEM_UI_FLAG_FULLSCREEN
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN

            )
        }

        cardView.setOnClickListener { startActivity(Intent(this,NinthActivity::class.java)) }
        prestetaires_a_la_une.setOnClickListener { startActivity(Intent(this,NinthActivity::class.java)) }
        categories_a_la_une.setOnClickListener { startActivity(Intent(this,TenthActivity::class.java)) }
    }
}