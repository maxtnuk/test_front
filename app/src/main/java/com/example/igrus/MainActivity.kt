package com.example.igrus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.igrus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //hello
        setContentView(binding.root)


    }
}