package ru.alexnimas.main_screen.di

import dagger.Component
import ru.alexnimas.core_api.ProvidersFacade
import ru.alexnimas.main_screen.ui.MainScreenViewModel

@Component(
    dependencies = [ProvidersFacade::class],
    modules = [MainScreenModule::class]
)
@MainScreenScope
interface MainScreenComponent {

    companion object {

        fun create(providersFacade: ProvidersFacade): MainScreenComponent {
            return DaggerMainScreenComponent.builder().providersFacade(providersFacade).build()
        }
    }

    fun getViewModel(): MainScreenViewModel
}