package id.yukngoding.data.di

import dagger.Module
import dagger.Provides
import id.yukngoding.data.movies.repository.source.network.MoviesApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideMoviesApi(builder: Retrofit.Builder): MoviesApi =
        builder
            .build()
            .create(MoviesApi::class.java)

}