package ru.alexnimas.core_impl

import dagger.Component
import ru.alexnimas.core_api.providers.NetworkProvider

@Component(
    modules = [NetworkModule::class]
)
interface NetworkComponent : NetworkProvider
