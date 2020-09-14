package id.yukngoding.domain.movies

import id.yukngoding.domain.movies.model.Movie
import io.reactivex.Observable

interface MoviesRepository {

    fun getNowPlaying(): Observable<List<Movie>>
}