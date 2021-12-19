package ru.alexnimas.main_screen.di

import dagger.Component
import ru.alexnimas.main_screen.ui.MainScreenViewModel

@Component(
    modules = [MainScreenModule::class]
)
@MainScreenScope
interface MainScreenComponent {

    @Component.Builder
    interface Builder {
        fun build(): MainScreenComponent
    }

    fun getViewModel(): MainScreenViewModel
}