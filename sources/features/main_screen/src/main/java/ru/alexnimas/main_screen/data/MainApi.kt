package ru.alexnimas.main_screen.data

import retrofit2.http.GET
import retrofit2.http.Query
import ru.alexnimas.main_screen.data.model.response.CurrentResponse

interface MainApi {
    @GET("current.json")
    suspend fun getWeather(
        @Query("q") query: String,
        @Query("aqi") isAirQualityDataNeeded: String
    ): CurrentResponse
}