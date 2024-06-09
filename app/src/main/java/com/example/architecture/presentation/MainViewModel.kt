package com.example.architecture.presentation

import androidx.lifecycle.ViewModel
import com.example.architecture.data.UsefulActivityDto
import com.example.architecture.domain.GetUsefulActivityUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val getUsefulActivityUseCase: GetUsefulActivityUseCase
) : ViewModel() {

    private val defaultActivity = UsefulActivityDto(
        "default",
        0,
        "default"
    )
    private val _activityFlow = MutableStateFlow(defaultActivity)
    val activityFlow = _activityFlow.asStateFlow()

    suspend fun reloadUsefulActivity() {
        _activityFlow.value = getUsefulActivityUseCase.execute()
    }

}