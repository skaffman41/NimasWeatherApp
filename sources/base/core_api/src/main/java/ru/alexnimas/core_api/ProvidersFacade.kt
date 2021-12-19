package ru.alexnimas.core_api

import ru.alexnimas.core_api.providers.AppProvider
import ru.alexnimas.core_api.providers.FeatureProvider
import ru.alexnimas.core_api.providers.NetworkProvider

interface ProvidersFacade : FeatureProvider, AppProvider, NetworkProvider