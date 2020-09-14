package id.yukngoding.explorepattern.feature.nowPlaying

import id.yukngoding.domain.UseCase
import id.yukngoding.domain.movies.interactor.GetNowPlaying
import javax.inject.Inject

class NowPlayingPresenter @Inject constructor(
    private val getNowPlaying: GetNowPlaying,
    private val view: NowPlayingContract.View
) : NowPlayingContract.Presenter {

    override fun getNowPlaying() {
        getNowPlaying.execute(UseCase.None(), onSuccess = {
            view.onGetNowPlayingSuccess(it)
        }, onError = {
            view.onGetNowPlayingFailed("something went wrong")
        })
    }
}