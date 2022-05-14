package com.killertech.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.killertech.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var index: Int = 0
    private val quoteOne = Quote("The purpose of our lives is to be happy",
        "Dalai Lama")
    private val quoteTwo = Quote("You only live once, but if you do it right, once is enough",
        "Mae West")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.quote = quoteOne
    }

    fun onUpdate(v: View) {
        if (index == 0) {
            index = 1;
            binding.quote = quoteTwo
        } else {
            index = 0
            binding.quote = quoteOne
        }
    }

}