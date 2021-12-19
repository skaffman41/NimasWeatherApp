package ru.alexnimas.core_api.providers

import ru.alexnimas.core_api.features.DetailsFeature
import ru.alexnimas.core_api.features.MainScreenFeature
import ru.alexnimas.core_api.features.SearchFeature

interface FeatureProvider {
    fun provideMainScreenFeature(): MainScreenFeature
    fun provideDetailsFeature(): DetailsFeature
    fun provideSearchFeature(): SearchFeature
}