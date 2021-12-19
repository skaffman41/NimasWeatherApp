package ru.alexnimas.core

sealed class NavigationDestination(val destination: String) {
    object MainScreen : NavigationDestination("mainScreen")
    object Search : NavigationDestination("search")
}