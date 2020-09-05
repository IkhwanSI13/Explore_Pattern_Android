package id.yukngoding.explorepattern

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainVm : ViewModel() {

    var data = ObservableField("Data from MainVm")

    var count = 0

    fun refreshData() {
        Log.e("YukNgoding","MainVm refreshData")
        count++
        data.set("Refresh data form VM: $count")
    }

}