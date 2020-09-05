package id.yukngoding.explorepattern.bindingAdapter

import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class DataBindingVm : ViewModel() {
    var clickCount = ObservableInt(0)

    fun addClickCount() {
        clickCount.set(clickCount.get() + 1)
    }
}

//private fun ObservableInt.increment() {
//    set(get() + 1)
//}