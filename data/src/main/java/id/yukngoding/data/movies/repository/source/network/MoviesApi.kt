package id.yukngoding.data.movies.repository.source.network

import id.yukngoding.data.movies.repository.source.network.result.MoviesResult
import io.reactivex.Observable
import retrofit2.http.GET

interface MoviesApi {

    @GET("movie/now_playing")
    fun nowPlaying(): Observable<MoviesResult>

}