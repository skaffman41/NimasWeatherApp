package ru.alexnimas.core_api.features

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

interface MainScreenFeature {
    @Composable
    fun MainScreen(
        viewModel: ViewModel,
        navController: NavController
    )
}