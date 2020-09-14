package id.yukngoding.data.movies.mapper

import id.yukngoding.data.movies.repository.source.network.result.MovieResult
import id.yukngoding.data.movies.repository.source.network.result.MoviesResult
import id.yukngoding.domain.movies.model.Movie
import javax.inject.Inject

class MoviesResultMapper @Inject constructor() {

    fun transform(movieResults: MoviesResult): List<Movie> =
        movieResults.results.map { it.toMovies() }

    private fun MovieResult.toMovies() = Movie(
        title = this.title,
        overview = this.overview
    )
}