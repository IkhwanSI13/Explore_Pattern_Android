package id.yukngoding.data.movies.repository

import id.yukngoding.data.movies.repository.source.network.result.MoviesResult
import io.reactivex.Observable

interface MoviesEntityData {

    fun nowPlaying(): Observable<MoviesResult>
}