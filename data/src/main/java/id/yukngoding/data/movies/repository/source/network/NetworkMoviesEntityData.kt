package id.yukngoding.data.movies.repository.source.network

import id.yukngoding.data.movies.repository.MoviesEntityData
import id.yukngoding.data.movies.repository.source.network.result.MoviesResult
import io.reactivex.Observable
import javax.inject.Inject

class NetworkMoviesEntityData @Inject constructor(
    private val moviesApi: MoviesApi
) : MoviesEntityData {

    override fun nowPlaying(): Observable<MoviesResult> = moviesApi.nowPlaying()
}