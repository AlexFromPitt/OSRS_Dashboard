package com.example.osrs_dashboard.data.network.repository

import android.content.Context
import com.example.osrs_dashboard.data.network.services.OSRSClientApiService
import com.example.osrs_dashboard.data.network.models.ItemCategoryData
import com.example.osrs_dashboard.data.network.models.ItemData
import com.example.osrs_dashboard.data.network.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class OSRSClientApiRepository @Inject constructor(
    private val context: Context,
    private val api: OSRSClientApiService
){

    suspend fun getGrandExchangeItemById(item: String): Resource<ItemData> {
        val response = try {
            api.getGrandExchangeItemById(item)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occurred")
        }
        return Resource.Success(response)
    }

    suspend fun getGrandExchangeCategoryItemList(category: Int, alpha: String, page: Int): Resource<ItemCategoryData> {
        val response = try {
            api.getGrandExchangeCategoryItemList(category, alpha, page)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occurred")
        }
        return Resource.Success(response)
    }
}
