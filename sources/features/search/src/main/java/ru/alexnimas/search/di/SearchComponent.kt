package ru.alexnimas.search.di

import dagger.Component
import ru.alexnimas.search.ui.SearchViewModel

@Component(
    modules = [SearchModule::class]
)
@SearchScope
interface SearchComponent {

    @Component.Builder
    interface Builder {
        fun build(): SearchComponent
    }

    fun getViewModel(): SearchViewModel
}