package id.yukngoding.explorepattern.useCase.bindingAdapter

import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import id.yukngoding.explorepattern.base.BaseViewModel

class SecondVm : BaseViewModel() {
    var clickCount = ObservableInt(0)

    fun addClickCount() {
        clickCount.set(clickCount.get() + 1)
    }
}

//private fun ObservableInt.increment() {
//    set(get() + 1)
//}