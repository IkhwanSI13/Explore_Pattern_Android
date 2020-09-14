package id.yukngoding.explorepattern.di.component

import android.app.Application
import android.content.Context
import dagger.Component
import id.yukngoding.data.di.ApiModule
import id.yukngoding.data.di.NetworkModule
import id.yukngoding.domain.movies.MoviesRepository
import id.yukngoding.explorepattern.CleanArchApp
import id.yukngoding.explorepattern.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        NetworkModule::class,
        ApiModule::class
    ]
)
interface ApplicationComponent {

    fun inject(cleanArchApp: CleanArchApp)

    fun context(): Context

    fun application(): Application

    fun moviesRepository(): MoviesRepository
}