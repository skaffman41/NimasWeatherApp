package ru.alexnimas.main_screen.data

import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(): MainRepository {
    override fun getText(): String {
        return "Text from MainRepository"
    }
}