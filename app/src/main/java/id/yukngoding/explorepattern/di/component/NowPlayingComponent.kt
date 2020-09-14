package id.yukngoding.explorepattern.di.component

import dagger.Component
import id.yukngoding.explorepattern.di.PerActivity
import id.yukngoding.explorepattern.di.module.NowPlayingModule
import id.yukngoding.explorepattern.feature.nowPlaying.NowPlayingActivity

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [NowPlayingModule::class])
interface NowPlayingComponent {

    fun inject(nowPlayingActivity: NowPlayingActivity)
}