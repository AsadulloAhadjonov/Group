package com.example.asadullobegzodjon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asadullobegzodjon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
//viewBinding qoshib qoydm ukam