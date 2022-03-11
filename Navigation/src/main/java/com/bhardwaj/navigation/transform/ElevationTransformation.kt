package com.bhardwaj.navigation.transform

import android.view.View
import com.bhardwaj.navigation.util.SideNavUtils.evaluate

class ElevationTransformation(private val endElevation: Float) : RootTransformation {
    override fun transform(dragProgress: Float, rootView: View) {
        val elevation = evaluate(dragProgress, START_ELEVATION, endElevation)
        rootView.elevation = elevation
    }

    companion object {
        private const val START_ELEVATION = 0f
    }
}