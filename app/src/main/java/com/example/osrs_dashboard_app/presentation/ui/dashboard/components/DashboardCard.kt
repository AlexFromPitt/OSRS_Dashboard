package com.example.osrs_dashboard.presentation.ui.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.osrs_dashboard.presentation.ui.dashboard.DashboardCardState
import com.example.osrs_dashboard.presentation.ui.theme.OSRS_Primary_Dark
import com.example.osrs_dashboard.presentation.ui.theme.OSRS_Tertiary_Dark
import com.example.osrs_dashboard.presentation.ui.theme.OSRS_Text_Dark

@Composable
fun DashboardCard(
    navController: NavController,
    cardData: DashboardCardState,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(MaterialTheme.shapes.large.topStart))
            .border(2.dp, OSRS_Tertiary_Dark, RoundedCornerShape(MaterialTheme.shapes.large.topStart))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = modifier
                .background(OSRS_Primary_Dark)
                .padding(8.dp)
        ) {
            Row {
                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(cardData.image),
                    contentDescription = cardData.description,
                    )
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = cardData.title,
                    color = OSRS_Text_Dark,
                    modifier = Modifier.align(Alignment.CenterVertically))
                Spacer(modifier = Modifier.width(90.dp))
            }
        }
    }
}