package id.yukngoding.explorepattern.di

import id.yukngoding.explorepattern.MainVm
import id.yukngoding.explorepattern.useCase.bindingAdapter.SecondVm
import id.yukngoding.explorepattern.useCase.rv.RecyclerViewVm
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val activityModule = module {
    viewModel { MainVm() }
    viewModel { SecondVm() }
    viewModel { RecyclerViewVm(get()) }
}

val sampleApp = listOf(activityModule, networkModule)