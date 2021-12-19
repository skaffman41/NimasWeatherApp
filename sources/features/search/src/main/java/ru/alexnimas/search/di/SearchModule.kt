package ru.alexnimas.search.di

import dagger.Module
import dagger.Provides
import ru.alexnimas.search.ui.SearchViewModel

@Module
class SearchModule {
    @Provides
    @SearchScope
    fun provideViewModel(): SearchViewModel = SearchViewModel()
}