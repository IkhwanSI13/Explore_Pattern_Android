package id.yukngoding.explorepattern.feature.load

import android.os.Bundle
import android.view.View
import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.di.module.api.ApiInterface
import id.yukngoding.explorepattern.di.module.db.MySharedPreferences
import kotlinx.android.synthetic.main.activity_load.*
import javax.inject.Inject

class LoadActivity : DaggerAppCompatActivity(), LoadContract.View, View.OnClickListener {

    @Inject
    lateinit var pref: MySharedPreferences

    @Inject
    lateinit var api: ApiInterface

    lateinit var presenter: LoadPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        presenter = LoadPresenter(pref, api)
        presenter.setView(this, this)

        btn_internet.setOnClickListener(this)
        btn_local.setOnClickListener(this)

        presenter.setSampleLocal()
    }

    override fun resultData(messageError: String?, result: String?) {
        messageError?.let {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        } ?: run {
            tv_load.text = "Result: $result"
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_internet -> {
                presenter.loadFromInternet()
            }
            R.id.btn_local -> {
                presenter.loadFromLocal()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dropView()
    }

}