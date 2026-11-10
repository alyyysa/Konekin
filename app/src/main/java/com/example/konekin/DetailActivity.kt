package com.example.konekin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konekin.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data yang dikirim lewat Intent
        val name = intent.getStringExtra("EXTRA_NAME")
        val salary = intent.getIntExtra("EXTRA_SALARY", 0)
        val age = intent.getIntExtra("EXTRA_AGE", 0)

        // Tampilkan ke TextView
        binding.tvDetailName.text = name
        binding.tvDetailSalary.text = "Salary: $$salary"
        binding.tvDetailAge.text = "Age: $age years old"
    }
}