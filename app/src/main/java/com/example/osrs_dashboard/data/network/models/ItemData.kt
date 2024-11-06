package com.example.osrs_dashboard.data.network.models

data class ItemData(
    val item: Item,
)

data class Item(
    val icon: String,
    val iconLarge: String,
    val id: Long,
    val type: String,
    val typeIcon: String,
    val name: String,
    val description: String,
    val current: Current,
    val today: Today,
    val members: String,
    val day30: Day30,
    val day90: Day90,
    val day180: Day180,
)

data class Day30(
    val trend: String,
    val change: String,
)

data class Day90(
    val trend: String,
    val change: String,
)

data class Day180(
    val trend: String,
    val change: String,
)
