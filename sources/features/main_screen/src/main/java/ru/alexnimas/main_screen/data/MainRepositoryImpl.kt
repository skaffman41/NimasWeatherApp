package ru.alexnimas.main_screen.data

import ru.alexnimas.main_screen.data.model.response.CurrentResponse
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: MainApi
) : MainRepository {
    override suspend fun getWeather(query: String): CurrentResponse {
        return api.getWeather(query = query, isAirQualityDataNeeded = "no")
    }
}