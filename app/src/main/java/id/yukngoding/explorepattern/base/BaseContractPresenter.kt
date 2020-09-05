package id.yukngoding.explorepattern.base

import android.content.Context

interface BaseContractPresenter<T> {

    fun setView(context: Context, view: T)

    fun dropView()

}