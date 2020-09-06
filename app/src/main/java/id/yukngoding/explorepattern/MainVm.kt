package id.yukngoding.explorepattern

import android.util.Log
import androidx.databinding.ObservableField
import id.yukngoding.explorepattern.base.BaseViewModel

class MainVm : BaseViewModel() {

    var data = ObservableField("Data from MainVm")

    var count = 0

    fun refreshData() {
        Log.e("YukNgoding", "MainVm refreshData")
        count++
        data.set("Refresh data form VM: $count")
    }

}