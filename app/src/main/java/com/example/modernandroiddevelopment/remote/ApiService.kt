package com.example.modernandroiddevelopment.remote

import com.example.modernandroiddevelopment.model.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users") fun getUsers():Call<List<User>>
}