package com.example.architecture.data

import com.example.architecture.api.RetrofitInstance
import kotlinx.coroutines.delay
import javax.inject.Inject

class UsefulActivitiesRepository @Inject constructor(){

    val usefulActivity = UsefulActivityDto("Take a caffeine nap",  0, "None")

    suspend fun getUsefulActivity(): UsefulActivityDto {

        delay(1000)
        //return RetrofitInstance.searchUsefulActivityApi.getUsefulActivity()
        return usefulActivity
    }

}