package ru.alexnimas.nimasweatherapp.ui.di

import dagger.Component
import ru.alexnimas.core_api.ProvidersFacade
import ru.alexnimas.core_api.providers.AppProvider
import ru.alexnimas.core_api.providers.NetworkProvider
import ru.alexnimas.core_impl.DaggerNetworkComponent
import ru.alexnimas.nimasweatherapp.App
import ru.alexnimas.nimasweatherapp.MainActivity

@Component(
    dependencies = [AppProvider::class, NetworkProvider::class],
    modules = [FeatureBindings::class]
)
interface FacadeComponent : ProvidersFacade {
    companion object {
        fun init(application: App): FacadeComponent =
            DaggerFacadeComponent.builder()
                .appProvider(AppComponent.create(application))
                .networkProvider(DaggerNetworkComponent.builder().build())
                .build()
    }

    fun inject(app: App)
    fun inject(activity: MainActivity)
}