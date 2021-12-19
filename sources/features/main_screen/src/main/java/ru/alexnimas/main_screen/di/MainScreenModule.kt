package ru.alexnimas.main_screen.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.alexnimas.main_screen.data.MainApi
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

    @Provides
    @MainScreenScope
    fun provideApi(retrofit: Retrofit): MainApi {
        return retrofit.create(MainApi::class.java)
    }

    @Module
    interface MainScreenBinds {
        @Binds
        @MainScreenScope
        abstract fun provideMainRepository(repository: MainRepositoryImpl): MainRepository
    }
}