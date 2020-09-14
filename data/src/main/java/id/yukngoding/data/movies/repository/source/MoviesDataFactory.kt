package id.yukngoding.data.movies.repository.source

import id.yukngoding.data.common.Source
import id.yukngoding.data.movies.repository.MoviesEntityData
import id.yukngoding.data.movies.repository.source.local.LocalMoviesEntityData
import id.yukngoding.data.movies.repository.source.network.MoviesApi
import id.yukngoding.data.movies.repository.source.network.NetworkMoviesEntityData
import javax.inject.Inject

class MoviesDataFactory @Inject constructor(
    private val moviesApi: MoviesApi
) {

    fun createData(source: Source): MoviesEntityData =
        when (source) {
            Source.NETWORK -> NetworkMoviesEntityData(moviesApi)
            Source.LOCAL -> LocalMoviesEntityData()
//            Source.MOCK -> MockMoviesEntity()
        }
}