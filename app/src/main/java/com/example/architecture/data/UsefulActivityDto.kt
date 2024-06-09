package com.example.architecture.data

import com.example.architecture.entity.UsefulActivity
import com.squareup.moshi.Json
import javax.inject.Inject

class UsefulActivityDto @Inject constructor(
    @Json(name = "activity") override val activity: String,
    @Json(name = "participants") override val participants: Int,
    @Json(name = "type") override val type: String
) : UsefulActivity