package com.example.modernandroiddevelopment.views.model

data class Movies (
    val page: Int,
    val results: List<com.example.modernandroiddevelopment.views.model.Result>,
    val total_pages: Int,
    val total_results: Int
    )
