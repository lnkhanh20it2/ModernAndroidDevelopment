package com.example.modernandroiddevelopment.repository

import com.example.modernandroiddevelopment.model.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}