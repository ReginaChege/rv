package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun generateFibonacciSequence(nums: Int): List<Int> {
        val result = mutableListOf(0, 1)
        if (nums > 2) {
            for (num in 2 until nums) {
                result.add(result[num-1] + result[num-2])
            }
        }
        return result
    }

}