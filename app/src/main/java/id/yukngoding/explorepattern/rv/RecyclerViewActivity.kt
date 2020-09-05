package id.yukngoding.explorepattern.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityRecyclerViewBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_recycler_view)
        val viewModel = ViewModelProviders.of(this).get(RecyclerViewVm::class.java)
        binding.vm = viewModel

        viewModel.setViewModel()
        viewModel.addDummyData()
    }
}
