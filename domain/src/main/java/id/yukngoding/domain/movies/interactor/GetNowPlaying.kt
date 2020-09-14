package id.yukngoding.domain.movies.interactor

import id.yukngoding.domain.UseCase
import id.yukngoding.domain.movies.MoviesRepository
import id.yukngoding.domain.movies.model.Movie
import io.reactivex.Observable
import javax.inject.Inject

class GetNowPlaying @Inject constructor(
    private val moviesRepository: MoviesRepository
) : UseCase<List<Movie>, UseCase.None>() {

    override fun buildUseCase(params: None): Observable<List<Movie>> =
        moviesRepository.getNowPlaying()

}