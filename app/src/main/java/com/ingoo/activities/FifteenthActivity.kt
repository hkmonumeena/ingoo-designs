package com.ingoo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ingoo.R
import kotlinx.android.synthetic.main.activity_fifteenth.*

class FifteenthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteenth)

        constraintLayout3.setOnClickListener { startActivity(Intent(this,SixteenthActivity::class.java))  }
    }
}