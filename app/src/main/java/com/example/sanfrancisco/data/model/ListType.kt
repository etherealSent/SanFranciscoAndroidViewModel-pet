package com.example.sanfrancisco.data.model

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

enum class ListType {
    Restaurant, Park, Company, Liked
}

data class NavigationItemContent(
    val listType: ListType,
    val icon: ImageVector,
    @StringRes val text: Int
)