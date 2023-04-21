package com.example.sanfrancisco.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Restaurant(
    @StringRes val name: Int,
    @StringRes val typeOfKitchen: Int,
    @StringRes val address: Int,
    @DrawableRes val image: Int,
    val review: Double
)
