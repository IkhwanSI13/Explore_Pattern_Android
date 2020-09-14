package id.yukngoding.explorepattern.feature.nowPlaying

import id.yukngoding.domain.movies.model.Movie

interface NowPlayingContract {

    interface Presenter {
        fun getNowPlaying()
    }

    interface View {
        fun onGetNowPlayingSuccess(movies: List<Movie>)
        fun onGetNowPlayingFailed(message: String)
    }

}