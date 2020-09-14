package id.yukngoding.data.movies.repository

import id.yukngoding.data.common.Source
import id.yukngoding.data.movies.mapper.MoviesResultMapper
import id.yukngoding.data.movies.repository.source.MoviesDataFactory
import id.yukngoding.domain.movies.MoviesRepository
import id.yukngoding.domain.movies.model.Movie
import io.reactivex.Observable
import javax.inject.Inject

class MoviesEntityRepository @Inject constructor(
    private val moviesEntityDataFactory: MoviesDataFactory,
    private val moviesResultMapper: MoviesResultMapper
) : MoviesRepository {

    override fun getNowPlaying(): Observable<List<Movie>> =
        createMoviesData().nowPlaying()
            .map { moviesResultMapper.transform(it) }

    private fun createMoviesData(): MoviesEntityData =
        moviesEntityDataFactory.createData(Source.NETWORK)
}