package com.example.urbanrooftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urbanrooftask.bot.ChatBotActivity
import com.example.urbanrooftask.databinding.ActivityMainBinding
import com.example.urbanrooftask.tflite.DiseaseDetectionActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.selfAssessmentTool.setOnClickListener {
            val intent = Intent(this, DiseaseDetectionActivity::class.java)
            startActivity(intent)
        }
        binding.chatBot.setOnClickListener {
            val intent = Intent(this, ChatBotActivity::class.java)
            startActivity(intent)
        }
    }
}