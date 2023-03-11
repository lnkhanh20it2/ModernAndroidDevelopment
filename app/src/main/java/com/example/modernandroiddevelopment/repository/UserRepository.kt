package com.example.modernandroiddevelopment.repository

import com.example.modernandroiddevelopment.remote.ApiService

class UserRepository(private val apiService: ApiService) {
    fun getAllUsers() = apiService.getUsers()
}