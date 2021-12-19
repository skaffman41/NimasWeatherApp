package ru.alexnimas.nimasweatherapp.ui.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.alexnimas.nimasweatherapp.App

@Module
class AppModule {
    @Provides
    fun provideContext(app: App): Context = app.applicationContext
}