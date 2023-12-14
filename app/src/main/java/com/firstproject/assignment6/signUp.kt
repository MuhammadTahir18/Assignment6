package com.firstproject.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firstproject.assignment6.databinding.ActivitySignUpBinding

class signUp : AppCompatActivity() {

    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




    }
}