package id.yukngoding.explorepattern.di.module

import dagger.Module
import dagger.Provides
import id.yukngoding.explorepattern.feature.nowPlaying.NowPlayingContract
import id.yukngoding.explorepattern.feature.nowPlaying.NowPlayingPresenter

@Module
class NowPlayingModule(private val nowPlayingView: NowPlayingContract.View) {

    @Provides
    fun provideNowPlayingPresenter(nowPlayingPresenter: NowPlayingPresenter): NowPlayingContract.Presenter =
        nowPlayingPresenter

    @Provides
    fun provideNowPlayingView(): NowPlayingContract.View = nowPlayingView
}