package id.yukngoding.explorepattern.feature.load

import android.view.View
import androidx.lifecycle.Observer
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.base.BaseActivity
import id.yukngoding.explorepattern.di.module.api.ApiInterface
import id.yukngoding.explorepattern.di.module.db.MySharedPreferences
import kotlinx.android.synthetic.main.activity_load.*
import javax.inject.Inject

class LoadActivity : BaseActivity<LoadVm>(), View.OnClickListener {

    @Inject
    lateinit var pref: MySharedPreferences

    @Inject
    lateinit var api: ApiInterface

    var vm: LoadVm = LoadVm()

    override fun getLayout(): Int = R.layout.activity_load

    override fun initCreate() {
        setUpVm()

        btn_internet.setOnClickListener(this)
        btn_local.setOnClickListener(this)
    }

    private fun setUpVm() {
        vm.setUp(pref, api)
        vm.setSampleLocal()

        vm.observableDataLocal.observe(this, Observer {
            tv_load.text = "Result $it"
        })
        vm.observableDataInternet.observe(this, Observer {
            tv_load.text = "Result $it"
        })
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_internet -> {
                vm.loadFromInternet()
            }
            R.id.btn_local -> {
                vm.loadFromLocal()
            }
        }
    }

}