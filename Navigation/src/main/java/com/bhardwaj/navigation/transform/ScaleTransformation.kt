package com.bhardwaj.navigation.transform

import android.view.View
import com.bhardwaj.navigation.util.SideNavUtils.evaluate

class ScaleTransformation(private val endScale: Float) : RootTransformation {
    override fun transform(dragProgress: Float, rootView: View) {
        val scale = evaluate(dragProgress, START_SCALE, endScale)
        rootView.scaleX = scale
        rootView.scaleY = scale
    }

    companion object {
        private const val START_SCALE = 1f
    }
}