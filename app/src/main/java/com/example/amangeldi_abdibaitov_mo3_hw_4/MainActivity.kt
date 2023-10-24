package com.example.amangeldi_abdibaitov_mo3_hw_4


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.amangeldi_abdibaitov_mo3_hw_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        supportFragmentManager.beginTransaction().replace(R.id.fl_mine, ContinentsFragment()).commit()
    }
}