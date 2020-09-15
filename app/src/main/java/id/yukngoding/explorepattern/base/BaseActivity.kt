package id.yukngoding.explorepattern.base

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity<T : BaseViewModel> : DaggerAppCompatActivity() {

    protected lateinit var viewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        initCreate()
    }

    abstract fun getLayout(): Int
    abstract fun initCreate()

    override fun onDestroy() {
        viewModel.onDestroy()
        super.onDestroy()
    }

}