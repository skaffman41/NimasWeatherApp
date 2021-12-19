package ru.alexnimas.main_screen.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.alexnimas.main_screen.data.MainRepository
import ru.alexnimas.main_screen.data.MainRepositoryImpl
import ru.alexnimas.main_screen.ui.MainScreenViewModel

@Module(includes = [MainScreenModule.MainScreenBinds::class])
class MainScreenModule {
    @Provides
    @MainScreenScope
    fun provideViewModel(repository: MainRepository): MainScreenViewModel {
        return MainScreenViewModel(repository = repository)
    }

    @Module
    interface MainScreenBinds {
        @Binds
        @MainScreenScope
        abstract fun provideMainRepository(repository: MainRepositoryImpl): MainRepository
    }
}