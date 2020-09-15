package id.yukngoding.explorepattern.di.module.db

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class DbModule {

    @Provides
    internal fun provideSharedPreferences(context: Context): MySharedPreferences {
        return MySharedPreferences(context)
    }

}