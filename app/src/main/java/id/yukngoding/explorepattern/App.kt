package id.yukngoding.explorepattern

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import id.yukngoding.explorepattern.di.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}