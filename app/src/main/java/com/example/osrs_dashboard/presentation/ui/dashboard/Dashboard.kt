package com.example.osrs_dashboard.presentation.ui.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.osrs_dashboard.R
import com.example.osrs_dashboard.presentation.ui.dashboard.components.DashboardCardList
import com.example.osrs_dashboard.presentation.ui.theme.OSRS_Surface_Dark
import com.example.osrs_dashboard.utils.constants.DashboardConstants

@Composable
fun Dashboard(
    navController: NavController
) {
    Surface(
        color = OSRS_Surface_Dark,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Image(painter = painterResource(id = R.drawable.osrs_logo),
                contentDescription = "Pokemon",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))
            DashboardCardList(
                navController = navController,
                cardList = DashboardConstants.DASHBOARD_CARD_DATA)
        }
    }
}