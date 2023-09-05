package com.furkanharmanci.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.furkanharmanci.kotlinrecyclerview.databinding.ActivityDetailsBinding
import com.furkanharmanci.kotlinrecyclerview.model.ValorantSingleton

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val output = ValorantSingleton.once // Singleton ile tek obje oluşumu

        // verileri let ile tek kod bloğunda yazdırmak
        output?.let {
            binding.name.text = it.agentName
            binding.position.text = it.agentPosition
            binding.imageView.setImageResource(it.agentImage)
            binding.about.text = it.agentAbout
        }
    }
}