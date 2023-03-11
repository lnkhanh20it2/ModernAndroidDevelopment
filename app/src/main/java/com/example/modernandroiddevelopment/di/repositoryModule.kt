package com.example.modernandroiddevelopment.di

import com.example.modernandroiddevelopment.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        UserRepository(get())
    }
}