package com.project.marsrealstate.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.marsrealstate.network.MarsAPI
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class OverviewViewModel : ViewModel() {
    private val _response = MutableLiveData<String>()

    val response: LiveData<String>
        get() = _response

    init {
        getMarsRealEstateProperties()
    }

    private fun getMarsRealEstateProperties() {
        MarsAPI.retrofitService.getProperties().enqueue(object : retrofit2.Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                _response.value = response.body()
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                _response.value = "Failure: ${t.message}"
            }

        })
    }
}