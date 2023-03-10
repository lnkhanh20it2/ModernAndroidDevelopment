package com.example.modernandroiddevelopment.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modernandroiddevelopment.data.RetrofitInstance
import com.example.modernandroiddevelopment.views.model.Movies
import com.example.modernandroiddevelopment.views.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieViewModel : ViewModel() {
    private var movieLiveData =
        MutableLiveData<List<com.example.modernandroiddevelopment.views.model.Result>>()

    fun getPopularMovies() {
        RetrofitInstance.api.getPopularMovies("65e4a7578cee2828fedc6aadcb823aa0").enqueue(object :
            Callback<Movies> {
            override fun onResponse(call: Call<Movies>, response: Response<Movies>) {
                if (response.body() != null) {
                    movieLiveData.value = response.body()!!.results
                } else {
                    return
                }
            }

            override fun onFailure(call: Call<Movies>, t: Throwable) {
                Log.d("TAG", t.message.toString())
            }
        })
    }

    fun observeMovieLiveData(): LiveData<List<com.example.modernandroiddevelopment.views.model.Result>> {
        return movieLiveData
    }
}
