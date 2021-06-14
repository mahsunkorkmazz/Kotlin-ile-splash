package com.mahsunk.splash


import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashEkranActivity2 : AppCompatActivity() {


    private val splasherkanızaman: Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_ekran2)

        Handler().postDelayed({

            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, splasherkanızaman)





    }
}