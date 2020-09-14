package id.yukngoding.explorepattern

import android.app.Application
import id.yukngoding.data.di.ApiModule
import id.yukngoding.data.di.NetworkModule
import id.yukngoding.explorepattern.di.component.ApplicationComponent
import id.yukngoding.explorepattern.di.component.DaggerApplicationComponent
import id.yukngoding.explorepattern.di.module.ApplicationModule

class CleanArchApp : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .apiModule(ApiModule())
            .networkModule(NetworkModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)
    }
}