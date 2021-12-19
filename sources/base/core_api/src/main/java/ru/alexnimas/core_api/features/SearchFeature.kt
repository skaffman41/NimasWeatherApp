package ru.alexnimas.core_api.features

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel

interface SearchFeature {
    @Composable
    fun Search(viewModel: ViewModel)
}