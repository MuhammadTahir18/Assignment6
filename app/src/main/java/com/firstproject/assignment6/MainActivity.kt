package com.firstproject.assignment6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.firstproject.assignment6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding:ActivityMainBinding
    private val splashTimeOut: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
            Handler().postDelayed({

                val intent = Intent(this, homeScreen::class.java)
                startActivity(intent)
                finish() // Close the splash activity so it's not in the back stack
            }, splashTimeOut)




    }
}