package ru.alexnimas.main_screen.ui

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import ru.alexnimas.core.NavigationDestination
import ru.alexnimas.core_api.features.MainScreenFeature
import javax.inject.Inject

class MainScreenFeatureImpl @Inject constructor() : MainScreenFeature {
    @Composable
    override fun MainScreen(
        viewModel: ViewModel,
        navController: NavController
    ) {
        val vm = viewModel as MainScreenViewModel
        Text(
            text = vm.text,
            modifier = Modifier.clickable {
                navController.navigate(NavigationDestination.Search.destination)
            }
        )
    }
}