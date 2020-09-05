package id.yukngoding.explorepattern

import android.content.Context

class MainPresenter : MainContract.Presenter {

    private var view: MainContract.View? = null
    private var context: Context? = null

    var resultData = "before"

    override fun setView(context: Context, view: MainContract.View) {
        this.view = view
        this.context = context
    }

    override fun loadData() {
        resultData = "after"
        view?.resultData(null)
    }

    override fun dropView() {
        view = null
        context = null
    }

}