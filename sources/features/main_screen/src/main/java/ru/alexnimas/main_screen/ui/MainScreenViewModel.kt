package ru.alexnimas.main_screen.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.alexnimas.main_screen.data.MainRepository

class MainScreenViewModel (
    private val repository: MainRepository
) : ViewModel() {
    val text: String = repository.getText()

    init {
        Log.d("TAGF", "MainScreenViewModel inited || $this")
    }

    override fun onCleared() {
        Log.d("TAGF", "MainScreenViewModel onCleared || $this")
        super.onCleared()
    }
}