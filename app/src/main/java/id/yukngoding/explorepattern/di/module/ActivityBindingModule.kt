package id.yukngoding.explorepattern.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.yukngoding.explorepattern.feature.main.MainActivity
import id.yukngoding.explorepattern.di.scop.ActivityScoped
import id.yukngoding.explorepattern.feature.load.LoadActivity

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun loadActivity(): LoadActivity

//    @ActivityScoped
//    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
//    internal abstract fun secondActivity(): SecondActivity

}