package com.example.architecture.domain

import com.example.architecture.data.UsefulActivitiesRepository
import com.example.architecture.data.UsefulActivityDto
import com.example.architecture.entity.UsefulActivity
import retrofit2.Response
import javax.inject.Inject

class GetUsefulActivityUseCase @Inject constructor(
    val usefulActivitiesRepository: UsefulActivitiesRepository
) {

    suspend fun execute(): UsefulActivityDto {
        return usefulActivitiesRepository.getUsefulActivity()
    }
}