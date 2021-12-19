package ru.alexnimas.nimasweatherapp.ui.di

import dagger.BindsInstance
import dagger.Component
import ru.alexnimas.core_api.providers.AppProvider
import ru.alexnimas.nimasweatherapp.App

@Component(modules = [AppModule::class])
interface AppComponent : AppProvider {
    companion object {

        private var appComponent: AppProvider? = null

        fun create(application: App): AppProvider {
            return appComponent ?: DaggerAppComponent
                .builder()
                .application(application)
                .build().also {
                    appComponent = it
                }
        }
    }

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(context: App): Builder

        fun build(): AppComponent
    }
}