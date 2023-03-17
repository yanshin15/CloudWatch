package com.yanshin.cloudwatch.network

import com.yanshin.cloudwatch.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    fun getCurrentWeather(
        @Query("q") location: String,
        @Query("appid") apiKey: String,
        ): Call<WeatherResponse>
}