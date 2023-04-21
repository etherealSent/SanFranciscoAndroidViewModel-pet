package com.example.sanfrancisco.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Park(
    val id: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int,
    val square: Int
)
