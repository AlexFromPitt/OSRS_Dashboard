package com.example.osrs_dashboard.data.network.models

data class ItemCategoryData(
    val total: Int,
    val items: List<CategoryItemData>,
)

data class CategoryItemData(
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
)
