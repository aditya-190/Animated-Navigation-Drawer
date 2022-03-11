package com.bhardwaj.navigation

interface SlidingRootNav {
    val isMenuClosed: Boolean
    val isMenuOpened: Boolean
    var isMenuLocked: Boolean
    fun closeMenu()
    fun closeMenu(animated: Boolean)
    fun openMenu()
    fun openMenu(animated: Boolean)
    val layout: SlidingRootNavLayout?
}