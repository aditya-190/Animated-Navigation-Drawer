package com.bhardwaj.navigation.util

object SideNavUtils {
    @JvmStatic
    fun evaluate(fraction: Float, startValue: Float, endValue: Float): Float {
        return startValue + fraction * (endValue - startValue)
    }
}