package com.aravi.imagesearchapp.api

import com.aravi.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponce(
    val total: Long,
    val total_pages: Long,
    val results: List<UnsplashPhoto>
)