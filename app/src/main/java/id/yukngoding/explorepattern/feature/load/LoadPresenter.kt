package id.yukngoding.explorepattern.feature.load

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import id.yukngoding.explorepattern.di.module.api.ApiInterface
import id.yukngoding.explorepattern.di.module.db.MySharedPreferences
import id.yukngoding.explorepattern.model.NewsModel
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class LoadPresenter(var pref: MySharedPreferences, var api: ApiInterface) : LoadContract.Presenter {

    private var context: Context? = null
    private var view: LoadContract.View? = null

    var text = "sample"

    override fun setView(context: Context, view: LoadContract.View) {
        this.context = context
        this.view = view
    }

    override fun setSampleLocal() {
        pref.putData(text, "Sample Data")
    }

    override fun loadFromLocal() {
        val result = pref.getData(text)
        view?.resultData(null, result)
    }

    override fun loadFromInternet() {
        api.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<NewsModel>> {
                override fun onComplete() {
                    Log.e("YukNgoding.Id", "rxJava2 on complete")
                }

                override fun onSubscribe(d: Disposable) {
                    Log.e("YukNgoding.Id", "rxJava2 on subscribe")
                }

                override fun onNext(t: List<NewsModel>) {
                    val result = Gson().toJson(t)
                    Log.e("YukNgoding.Id", "rxJava2 on next $result")
                    view?.resultData(null, result)
                }

                override fun onError(e: Throwable) {
                    Log.e("YukNgoding.Id", "rxJava2 on error " + e.message)
                }
            })
    }

    override fun dropView() {
        view = null
        context = null
    }

}