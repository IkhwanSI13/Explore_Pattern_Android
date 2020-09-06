package id.yukngoding.explorepattern

import android.app.Application
import id.yukngoding.explorepattern.di.sampleApp
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin context
        startKoin(this, sampleApp)
    }
}

