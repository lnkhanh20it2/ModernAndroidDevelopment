package com.example.modernandroiddevelopment

import com.example.modernandroiddevelopment.repository.CryptocurrencyRepository
import com.example.modernandroiddevelopment.repository.CryptocurrencyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository(): CryptocurrencyRepository = CryptocurrencyRepositoryImpl()
}
