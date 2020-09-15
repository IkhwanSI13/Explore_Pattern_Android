package id.yukngoding.explorepattern.feature.load

import id.yukngoding.explorepattern.base.BaseContractPresenter
import id.yukngoding.explorepattern.base.BaseContractView

interface LoadContract {
    interface View : BaseContractView<Presenter> {
        fun resultData(messageError: String?, result: String?)
    }

    interface Presenter : BaseContractPresenter<View> {
        fun setSampleLocal()
        fun loadFromLocal()
        fun loadFromInternet()
    }
}