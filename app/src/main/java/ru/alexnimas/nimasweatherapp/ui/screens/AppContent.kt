package ru.alexnimas.nimasweatherapp.ui.screens

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.alexnimas.core.DaggerViewModel
import ru.alexnimas.core.NavigationDestination
import ru.alexnimas.core_api.AppWithFacade
import ru.alexnimas.core_api.features.MainScreenFeature
import ru.alexnimas.core_api.features.SearchFeature
import ru.alexnimas.main_screen.di.MainScreenComponent
import ru.alexnimas.nimasweatherapp.R
import ru.alexnimas.search.di.DaggerSearchComponent

@Composable
fun AppContent(
    mainScreenFeature: MainScreenFeature,
    searchFeature: SearchFeature,
    application: Application
) {
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xff37b3db),
                        Color(0xff448cf5)
                    )
                )
            )
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_left),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 42.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_right),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
        )

        NavHost(
            navController = navController,
            startDestination = NavigationDestination.MainScreen.destination
        ) {
            composable(route = NavigationDestination.MainScreen.destination) {
                mainScreenFeature.MainScreen(
                    viewModel = DaggerViewModel {
                        MainScreenComponent.create(
                            (application as AppWithFacade).getFacade()
                        ).getViewModel()
                    },
                    navController = navController
                )
            }
            composable(route = NavigationDestination.Search.destination) {
                searchFeature.Search(
                    viewModel = DaggerViewModel {
                        DaggerSearchComponent.builder().build().getViewModel()
                    }
                )
            }
        }
    }
}