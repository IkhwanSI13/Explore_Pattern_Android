package id.yukngoding.explorepattern.useCase.bindingAdapter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var viewModel: SecondVm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)
        viewModel = ViewModelProviders.of(this).get(SecondVm::class.java)

        binding.vm = viewModel
        binding.activity = this
    }

    fun onButtonClick(v: View) {
        viewModel.addClickCount()
    }

}
