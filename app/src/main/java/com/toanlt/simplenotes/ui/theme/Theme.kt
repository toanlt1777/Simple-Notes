package com.toanlt.simplenotes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = White,
    onPrimary = Black,
    primaryVariant = PaleWhite,
    surface = Yellow600,
    secondary = Yellow600,
)

private val DarkColorPalette = darkColors(
    primary = Black,
    onPrimary = White,
    primaryVariant = PaleBlack,
    surface = Yellow600,
    secondary = Yellow600
)

@Composable
fun SimpleNotesTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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