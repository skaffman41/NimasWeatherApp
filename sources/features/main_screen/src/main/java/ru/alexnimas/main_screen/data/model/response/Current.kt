package ru.alexnimas.main_screen.data.model.response

import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("feelslike_c") val feelsLikeC: Double = 0.0,
    @SerializedName("is_day") val isDay: Int = 0,
    @SerializedName("temp_c") val tempC: Double = 0.0,
    @SerializedName("wind_kph") val windKph: Double = 0.0,
    val condition: Condition,
    val humidity: Int = 0
)