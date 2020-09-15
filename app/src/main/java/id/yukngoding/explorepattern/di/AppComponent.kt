package id.yukngoding.explorepattern.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import id.yukngoding.explorepattern.App
import id.yukngoding.explorepattern.di.module.ActivityBindingModule
import id.yukngoding.explorepattern.di.module.AppModule
import id.yukngoding.explorepattern.di.module.api.ApiModule
import id.yukngoding.explorepattern.di.module.db.DbModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ApiModule::class,
        DbModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}
