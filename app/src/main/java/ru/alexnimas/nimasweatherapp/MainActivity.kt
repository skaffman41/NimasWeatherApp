package ru.alexnimas.nimasweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.alexnimas.core.DaggerViewModel
import ru.alexnimas.core.NavigationDestination
import ru.alexnimas.core_api.features.MainScreenFeature
import ru.alexnimas.core_api.features.SearchFeature
import ru.alexnimas.main_screen.di.DaggerMainScreenComponent
import ru.alexnimas.main_screen.di.MainScreenComponent
import ru.alexnimas.main_screen.ui.MainScreenViewModel
import ru.alexnimas.nimasweatherapp.ui.di.FacadeComponent
import ru.alexnimas.nimasweatherapp.ui.theme.NimasWeatherAppTheme
import ru.alexnimas.search.di.DaggerSearchComponent
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var mainScreenFeature: MainScreenFeature

    @Inject
    lateinit var searchFeature: SearchFeature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ((application as App).getFacade() as FacadeComponent).inject(this)
        setContent {
            NimasWeatherAppTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = NavigationDestination.MainScreen.destination
                ) {
                    composable(route = NavigationDestination.MainScreen.destination) {
                        mainScreenFeature.MainScreen(
                            viewModel = DaggerViewModel {
                                DaggerMainScreenComponent.builder().build().getViewModel()
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
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NimasWeatherAppTheme {
        Greeting("Android")
    }
}