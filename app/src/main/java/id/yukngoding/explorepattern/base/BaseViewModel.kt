package id.yukngoding.explorepattern.base

import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel : ViewModel() {

    private val disposables: CompositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun clearSubscriptions() {
        disposables.clear()
    }

    fun onDestroy() {
        clearSubscriptions()
        Log.e("checkLog", "BaseViewModel: onDestroy ViewModel")
    }

}