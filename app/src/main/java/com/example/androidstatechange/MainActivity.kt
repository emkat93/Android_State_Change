package com.example.androidstatechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "StateChange"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "OnCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "OnRestart")
    }
}