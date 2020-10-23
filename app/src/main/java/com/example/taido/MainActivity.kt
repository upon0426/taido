package com.example.taido

import android.app.Activity
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.build_my_first_app_in_kotlin.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record)

        findViewById<Button>(R.id.record).setOnClickListener { view ->
            Log.v(TAG, "record is clicked")
        }
        findViewById<Button>(R.id.stop).setOnClickListener { view ->
            Log.v(TAG, "stop is clicked")
        }
        findViewById<Button>(R.id.play).setOnClickListener { view ->
            Log.v(TAG, "play is clicked")
        }
    }
}