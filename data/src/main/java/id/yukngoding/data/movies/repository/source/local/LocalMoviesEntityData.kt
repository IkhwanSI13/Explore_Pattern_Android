package id.yukngoding.data.movies.repository.source.local

import id.yukngoding.data.movies.repository.MoviesEntityData
import id.yukngoding.data.movies.repository.source.network.result.MoviesResult
import io.reactivex.Observable
import javax.inject.Inject

class LocalMoviesEntityData @Inject constructor(
) : MoviesEntityData {
    override fun nowPlaying(): Observable<MoviesResult> {
        TODO("Not yet implemented")
    }
}