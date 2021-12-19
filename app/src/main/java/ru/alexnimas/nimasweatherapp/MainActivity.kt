package ru.alexnimas.nimasweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.alexnimas.core_api.features.MainScreenFeature
import ru.alexnimas.core_api.features.SearchFeature
import ru.alexnimas.nimasweatherapp.ui.di.FacadeComponent
import ru.alexnimas.nimasweatherapp.ui.screens.AppContent
import ru.alexnimas.nimasweatherapp.ui.theme.NimasWeatherAppTheme
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
                AppContent(
                    mainScreenFeature = mainScreenFeature,
                    searchFeature = searchFeature,
                    application = application
                )
            }
        }
    }
}
