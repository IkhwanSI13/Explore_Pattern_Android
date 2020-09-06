package id.yukngoding.explorepattern

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import id.yukngoding.explorepattern.useCase.bindingAdapter.SecondActivity
import id.yukngoding.explorepattern.databinding.ActivityMainBinding
import id.yukngoding.explorepattern.useCase.rv.RecyclerViewActivity

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainVm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainVm::class.java)

        binding.vm = viewModel
        binding.activity = this
    }

    fun onClickRefreshData(view: View) {
        Log.e("YukNgoding", "onClickRefreshData")
        viewModel.refreshData()
    }

    fun onClickRv(view: View) {
        Log.e("YukNgoding", "onClickRv")
        startActivity(Intent(view.context, RecyclerViewActivity::class.java))
    }

    fun onClickBindingAdapter(view: View) {
        Log.e("YukNgoding", "onClickBindingAdapter")
        startActivity(Intent(view.context, SecondActivity::class.java))
    }

}