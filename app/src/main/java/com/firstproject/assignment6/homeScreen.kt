package com.firstproject.assignment6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firstproject.assignment6.databinding.ActivityHomeScreenBinding
import kotlin.math.sign

class homeScreen : AppCompatActivity() {

    private  lateinit var  binding:ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        binding.signin.setOnClickListener(){
            startActivity(Intent(this,signIn::class.java))
        }

    }
}