package com.example.osrs_dashboard.utils.constants

import com.example.osrs_dashboard.R
import com.example.osrs_dashboard.presentation.ui.dashboard.DashboardCardState

object DashboardConstants {
    val DASHBOARD_CARD_DATA = listOf(
            DashboardCardState(
            title = "Grand Exchange Hub",
            description = "Hub for looking up information pertaining to the Grand Exchange.",
            route = "grand_exchange_viewer",
            image = R.drawable.grand_exchange_logo
        )
    )
}