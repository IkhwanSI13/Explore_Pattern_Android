package id.yukngoding.explorepattern.useCase.bindingAdapter

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableInt

object BindingAdapter {

    //Use this method only to TextView, because the param.
    @BindingAdapter("app:clickTwiceAndGone")
    @JvmStatic
    fun clickTwiceAndGone(view: TextView, clickCount: ObservableInt) {
        view.visibility = if (clickCount.get() >= 2) View.GONE else View.VISIBLE
    }

}