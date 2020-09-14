package id.yukngoding.explorepattern.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import id.yukngoding.data.movies.repository.MoviesEntityRepository
import id.yukngoding.domain.movies.MoviesRepository
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    fun provideApplication() = application

    @Provides
    @Singleton
    fun provideMoviesRepository(moviesEntityRepository: MoviesEntityRepository): MoviesRepository =
        moviesEntityRepository
}