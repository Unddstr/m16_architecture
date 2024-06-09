package com.example.architecture.api

import com.example.architecture.data.UsefulActivityDto
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.boredapi.com"

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
    val searchUsefulActivityApi: SearchUsefulActivityAPI = retrofit.create(
        SearchUsefulActivityAPI::class.java
    )
}

interface SearchUsefulActivityAPI {
    @GET("/api/activity/")
    suspend fun getUsefulActivity(): UsefulActivityDto
}