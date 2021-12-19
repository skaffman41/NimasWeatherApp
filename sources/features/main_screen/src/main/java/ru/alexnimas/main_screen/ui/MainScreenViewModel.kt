package ru.alexnimas.main_screen.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.alexnimas.main_screen.data.MainRepository

class MainScreenViewModel(
    private val repository: MainRepository
) : ViewModel() {
    val state = mutableStateOf("")

    init {
        Log.d("TAGF", "MainScreenViewModel inited || $this")
        viewModelScope.launch {
            val weather = repository.getWeather("London")
            state.value = weather.current.tempC.toString()
        }
    }

    override fun onCleared() {
        Log.d("TAGF", "MainScreenViewModel onCleared || $this")
        super.onCleared()
    }
}