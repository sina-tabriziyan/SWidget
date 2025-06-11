package com.sina.library.model

import android.view.View
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes

sealed class ToolbarContent {
    data class Menu(@MenuRes val menuRes: Int) : ToolbarContent()
    data class CustomLayout(@LayoutRes val layoutRes: Int) : ToolbarContent()
    data class CustomView(val view: View) : ToolbarContent()
}
