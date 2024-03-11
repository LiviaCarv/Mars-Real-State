package com.project.marsrealstate.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.project.marsrealstate.network.MarsAPI
import com.project.marsrealstate.network.MarsProperty
import kotlinx.coroutines.launch


class OverviewViewModel : ViewModel() {
    private val _status = MutableLiveData<String>()
    val status: LiveData<String>
        get() = _status

    private val _properties = MutableLiveData<List<MarsProperty>>()
    val properties: LiveData<List<MarsProperty>>
        get() = _properties

    init {
        getMarsRealEstateProperties()
    }

    private fun getMarsRealEstateProperties() {
        viewModelScope.launch {
            try {
                val listResult = MarsAPI.retrofitService.getProperties()
                _status.value = "Success: ${listResult.size} Mars properties retrieved"
                if (listResult.size > 0) {
                    _properties.value = listResult
                }
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }
        }
    }
}