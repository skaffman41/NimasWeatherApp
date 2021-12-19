package ru.alexnimas.search.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SearchViewModel @Inject constructor() : ViewModel() {
    val text: String = "Text from SearchViewModel"

    init {
        Log.d("TAGF", "SearchViewModel inited || $this")
    }

    override fun onCleared() {
        Log.d("TAGF", "SearchViewModel onCleared || $this")
        super.onCleared()
    }
}