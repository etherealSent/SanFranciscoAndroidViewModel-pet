package com.example.sanfrancisco.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkThemePrimary,
    onPrimary = DarkThemeOnPrimary,
    surface = DarkThemeSurface,
    onSurface = DarkThemeOnSurface,
    secondary = DarkThemeSecondary,
    background = DarkThemeBackground,
    secondaryVariant = DarkThemeSecondaryVariant
)

private val LightColorPalette = lightColors(
    primary = DarkThemePrimary,
    onPrimary = DarkThemeOnPrimary,
    surface = DarkThemeSurface,
    onSurface = DarkThemeOnSurface,
    secondary = DarkThemeSecondary,
    background = DarkThemeBackground,
    secondaryVariant = DarkThemeSecondaryVariant
)

@Composable
fun SanFranciscoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}