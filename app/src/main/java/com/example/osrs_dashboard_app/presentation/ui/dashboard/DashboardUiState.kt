package com.example.osrs_dashboard.presentation.ui.dashboard

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class DashboardUiState(
    val title: String,
    val cards: List<DashboardCardState>
)

data class DashboardCardState(
    val title: String,
    val description: String,
    val route: String,
    @DrawableRes val image: Int
)