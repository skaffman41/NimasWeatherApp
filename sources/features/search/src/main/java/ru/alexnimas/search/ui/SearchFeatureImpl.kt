package ru.alexnimas.search.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import ru.alexnimas.core_api.features.SearchFeature
import javax.inject.Inject

class SearchFeatureImpl @Inject constructor() : SearchFeature {
    @Composable
    override fun Search(viewModel: ViewModel) {
        val vm = viewModel as SearchViewModel
        Text(text = vm.text)
    }
}