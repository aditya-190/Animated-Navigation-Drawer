package com.bhardwaj.navigation.util

import android.content.Context
import androidx.drawerlayout.widget.DrawerLayout
import com.bhardwaj.navigation.SlidingRootNavLayout

class ActionBarToggleAdapter(context: Context?) : DrawerLayout(
    context!!
) {
    private var adaptee: SlidingRootNavLayout? = null
    override fun openDrawer(gravity: Int) {
        adaptee!!.openMenu()
    }

    override fun closeDrawer(gravity: Int) {
        adaptee!!.closeMenu()
    }

    override fun isDrawerVisible(drawerGravity: Int): Boolean {
        return !adaptee!!.isMenuClosed
    }

    override fun getDrawerLockMode(edgeGravity: Int): Int {
        return if (adaptee!!.isMenuLocked && adaptee!!.isMenuClosed) {
            LOCK_MODE_LOCKED_CLOSED
        } else if (adaptee!!.isMenuLocked && !adaptee!!.isMenuClosed) {
            LOCK_MODE_LOCKED_OPEN
        } else {
            LOCK_MODE_UNLOCKED
        }
    }

    fun setAdaptee(adaptee: SlidingRootNavLayout?) {
        this.adaptee = adaptee
    }
}