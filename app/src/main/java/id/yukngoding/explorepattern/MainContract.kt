package id.yukngoding.explorepattern

import id.yukngoding.explorepattern.base.BaseContractPresenter
import id.yukngoding.explorepattern.base.BaseContractView

interface MainContract {
    interface View : BaseContractView<Presenter> {
        fun resultData(messageError: String?)
    }

    interface Presenter : BaseContractPresenter<View> {
        fun loadData()
    }
}