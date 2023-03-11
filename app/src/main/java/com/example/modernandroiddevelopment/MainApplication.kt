package com.example.modernandroiddevelopment

import android.app.Application
import com.example.modernandroiddevelopment.di.apiModule
import com.example.modernandroiddevelopment.di.repositoryModule
import com.example.modernandroiddevelopment.di.retrofitModule
import com.example.modernandroiddevelopment.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }
}