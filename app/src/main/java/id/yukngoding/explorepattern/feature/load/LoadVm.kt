package id.yukngoding.explorepattern.feature.load

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import id.yukngoding.explorepattern.base.BaseViewModel
import id.yukngoding.explorepattern.di.module.api.ApiInterface
import id.yukngoding.explorepattern.di.module.db.MySharedPreferences
import id.yukngoding.explorepattern.model.NewsModel
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class LoadVm : BaseViewModel() {

    lateinit var pref: MySharedPreferences
    lateinit var api: ApiInterface

    var key = "sample"

    val observableDataLocal: LiveData<String> get() = _observableDataLocal
    private val _observableDataLocal = MutableLiveData<String>()

    val observableDataInternet: LiveData<String> get() = _observableDataInternet
    private val _observableDataInternet = MutableLiveData<String>()

    fun setUp(preferences: MySharedPreferences, apiInterface: ApiInterface) {
        this.pref = preferences
        api = apiInterface
    }

    fun setSampleLocal() {
        pref.putData(key, "Sample Data")
    }

    fun loadFromLocal() {
        _observableDataLocal.value = pref.getData(key)
    }

    fun loadFromInternet() {
        api.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<List<NewsModel>> {
                override fun onSuccess(t: List<NewsModel>) {
                    Log.e("checkLog", "rxJava2 on success:"+Gson().toJson(t))
                    _observableDataInternet.value = Gson().toJson(t)
                }

                override fun onSubscribe(d: Disposable) {
                    addDisposable(d)
                    Log.e("checkLog", "rxJava2 on subscribe")
                }

                override fun onError(e: Throwable) {
                    Log.e("checkLog", "rxJava2 on error " + e.message)
                }
            })
    }

}