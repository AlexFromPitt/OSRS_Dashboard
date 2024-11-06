package com.example.osrs_dashboard.data.network.services

import com.example.osrs_dashboard.data.network.models.ItemCategoryData
import com.example.osrs_dashboard.data.network.models.ItemData
import retrofit2.http.GET
import retrofit2.http.Query

interface OSRSClientApiService {

    @GET("api/catalogue/detail.json")
    suspend fun getGrandExchangeItemById(
        @Query("item") itemId: String
    ): ItemData

    @GET("api/catalogue/items.json?category=1&alpha={alpha}&page={pageNum}")
    suspend fun getGrandExchangeCategoryItemList(
        @Query("category") category: Int,
        @Query("alpha") alpha: String,
        @Query("page") page: Int
    ): ItemCategoryData
}
