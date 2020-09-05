package id.yukngoding.explorepattern.rv

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel

class RecyclerViewVm : ViewModel() {

    var itemList: ObservableArrayList<AdapterVm> = ObservableArrayList()
    var adapter = Adapter()

    fun setViewModel() {
        adapter.setValue(itemList)
    }

    fun addDummyData() {
        itemList.add(AdapterVm(Pojo("Value 1", "Value 2")))
        itemList.add(AdapterVm(Pojo("Des 1", "Des 2")))
        itemList.add(AdapterVm(Pojo("Lord 1", "Lord 2")))
    }

}