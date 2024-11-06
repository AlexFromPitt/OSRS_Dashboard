package com.example.osrs_dashboard.di

import android.app.Application
import android.content.Context
import com.example.osrs_dashboard.data.network.repository.OSRSClientApiRepository
import com.example.osrs_dashboard.data.network.services.OSRSClientApiService
import com.example.osrs_dashboard.data.network.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideOSRSClientApiService(): OSRSClientApiService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(OSRSClientApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideApplicationContext(application: Application): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    fun provideOSRSClientRepository(
        context: Context,
        api: OSRSClientApiService
    ) = OSRSClientApiRepository(context, api)
}