package ru.alexnimas.nimasweatherapp.ui.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.alexnimas.core_api.features.DetailsFeature
import ru.alexnimas.core_api.features.MainScreenFeature
import ru.alexnimas.core_api.features.SearchFeature
import ru.alexnimas.details.DetailsFeatureImpl
import ru.alexnimas.main_screen.ui.MainScreenFeatureImpl
import ru.alexnimas.search.ui.SearchFeatureImpl

@Module
interface FeatureBindings {
    @Binds
    @Reusable
    fun provideMainScreenFeature(mainScreenFeature: MainScreenFeatureImpl): MainScreenFeature

    @Binds
    @Reusable
    fun provideDetailsFeature(detailsFeature: DetailsFeatureImpl): DetailsFeature

    @Binds
    @Reusable
    fun provideSearchFeature(searchFeature: SearchFeatureImpl): SearchFeature
}