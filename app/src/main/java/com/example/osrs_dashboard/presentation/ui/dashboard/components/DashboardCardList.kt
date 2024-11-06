package com.example.osrs_dashboard.presentation.ui.dashboard.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.osrs_dashboard.presentation.ui.dashboard.DashboardCardState

@Composable
fun DashboardCardList(
    navController: NavController,
    cardList: List<DashboardCardState>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ) {
        items(cardList) { cardData ->
            DashboardCard(
                navController = navController,
                cardData = cardData,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}