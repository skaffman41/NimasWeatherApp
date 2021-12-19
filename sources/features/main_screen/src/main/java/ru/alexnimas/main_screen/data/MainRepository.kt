package ru.alexnimas.main_screen.data

import ru.alexnimas.main_screen.data.model.response.CurrentResponse

interface MainRepository {
    suspend fun getWeather(query: String): CurrentResponse
}