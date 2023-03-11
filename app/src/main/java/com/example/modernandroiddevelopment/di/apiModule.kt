package com.example.modernandroiddevelopment.di

import com.example.modernandroiddevelopment.remote.ApiService
import com.example.modernandroiddevelopment.repository.UserRepository
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun provideApi(retrofit: Retrofit): ApiService{
        return retrofit.create(ApiService::class.java)
    }
    single { provideApi(get ()) }
}
