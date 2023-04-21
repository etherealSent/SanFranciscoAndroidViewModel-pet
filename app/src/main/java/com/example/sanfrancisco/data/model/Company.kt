package com.example.sanfrancisco.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Company(
    @StringRes val name: Int,
    val founded: Int,
    val numberOfEmployees: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
