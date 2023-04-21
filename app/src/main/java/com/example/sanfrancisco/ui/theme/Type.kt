package com.example.sanfrancisco.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sanfrancisco.R

val Jost = FontFamily(
    Font(R.font.jost_medium)
)

val Cabin = FontFamily(
    Font(R.font.cabin_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    button = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    h1 = TextStyle(
        fontFamily = Jost,
        fontWeight = FontWeight.Medium,
        fontSize = 46.sp
    ),
    body1 = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    body2 = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
    )
)