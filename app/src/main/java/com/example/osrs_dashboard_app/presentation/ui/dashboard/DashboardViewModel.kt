package com.example.osrs_dashboard.presentation.ui.dashboard

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
    mutableStateFlow: MutableStateFlow<DashboardUiState>
): ViewModel() {
//    private val viewModelState: MutableStateFlow<DashboardUiState>
//
//        init {
//            val initialState = DashboardUiState(
//                title = "Old School Runescape Dashboard App",
//                cards = DashboardConstants.DASHBOARD_CARD_DATA
//            )
//
//            viewModelState = mutableStateFlow
//        }
}