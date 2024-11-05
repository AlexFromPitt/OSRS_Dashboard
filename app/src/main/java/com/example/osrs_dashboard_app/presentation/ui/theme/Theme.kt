package com.example.osrs_dashboard.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext

private val OSRS_Dark_Color_Theme = darkColorScheme(
    primary = OSRS_Primary_Dark,
    onPrimary = White,

    secondary = OSRS_Secondary_Dark,
    onSecondary = White,

    tertiary = OSRS_Tertiary_Dark,
    onTertiary = White,

    background = OSRS_Background_Dark,
    onBackground = White,

    surface = OSRS_Surface_Dark,
    onSurface = White
)

private val OSRS_Light_Color_Theme = lightColorScheme(
    primary = OSRS_Primary_Light,
    onPrimary = Black,

    secondary = OSRS_Secondary_Light,
    onSecondary = Black,

    tertiary = OSRS_Tertiary_Light,
    onTertiary = Black,

    background = OSRS_Background_Light,
    onBackground = Black,

    surface = OSRS_Surface_Light,
    onSurface = Black
)

@Composable
fun OSRS_Dashboard_Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> OSRS_Dark_Color_Theme
        else -> OSRS_Light_Color_Theme
    }

    CompositionLocalProvider {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}