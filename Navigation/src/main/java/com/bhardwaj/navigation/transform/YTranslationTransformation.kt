package com.bhardwaj.navigation.transform

import android.view.View
import com.bhardwaj.navigation.util.SideNavUtils.evaluate

class YTranslationTransformation(private val endTranslation: Float) : RootTransformation {
    override fun transform(dragProgress: Float, rootView: View) {
        val translation = evaluate(dragProgress, START_TRANSLATION, endTranslation)
        rootView.translationY = translation
    }

    companion object {
        private const val START_TRANSLATION = 0f
    }
}