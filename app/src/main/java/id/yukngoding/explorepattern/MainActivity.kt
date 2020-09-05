package id.yukngoding.explorepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View, View.OnClickListener {

    var presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.setView(this, this)

        tv_load.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_load -> {
                Log.e("YukNgoding", "check before from view:${presenter.resultData}")
                presenter.loadData()
            }
        }
    }

    override fun resultData(messageError: String?) {
        Log.e("YukNgoding", "messageError:${messageError.toString()}")
        Log.e("YukNgoding", "check after from view:${presenter.resultData}")
    }

}