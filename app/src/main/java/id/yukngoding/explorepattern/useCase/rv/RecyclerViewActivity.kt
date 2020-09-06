package id.yukngoding.explorepattern.useCase.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.databinding.ActivityRecyclerViewBinding
import org.koin.android.viewmodel.ext.android.viewModel

class RecyclerViewActivity : AppCompatActivity() {

    val myModel: RecyclerViewVm by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRecyclerViewBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_recycler_view)
        binding.vm = myModel
    }
}
