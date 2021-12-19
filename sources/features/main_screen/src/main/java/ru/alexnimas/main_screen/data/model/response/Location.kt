package ru.alexnimas.main_screen.data.model.response

import com.google.gson.annotations.SerializedName

data class Location(
    val country: String = "",
    @SerializedName("localtime_epoch") val localtimeEpoch: Long = 0,
    val name: String = "",
    val region: String = "",
)