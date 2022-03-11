package com.bhardwaj.navigation.util

import android.annotation.SuppressLint
import android.content.Context
import android.view.MotionEvent
import android.view.View
import com.bhardwaj.navigation.SlidingRootNavLayout

class HiddenMenuClickConsumer(context: Context?) : View(context) {
    private var menuHost: SlidingRootNavLayout? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return menuHost!!.isMenuClosed
    }

    fun setMenuHost(layout: SlidingRootNavLayout?) {
        menuHost = layout
    }
}