package com.bhardwaj.navigation.callback

interface DragStateListener {
    fun onDragStart()
    fun onDragEnd(isMenuOpened: Boolean)
}