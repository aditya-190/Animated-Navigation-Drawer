package com.bhardwaj.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SlidingRootNavBuilder(this)
            .withGravity(SlideGravity.RIGHT)
            .withMenuLayout(R.layout.navigation_drawer)
            .inject()
    }
}