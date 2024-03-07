package com.project.marsrealstate.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OverviewViewModel : ViewModel() {
    private val _response = MutableLiveData<String>()

    val response: LiveData<String>
        get() = _response
}