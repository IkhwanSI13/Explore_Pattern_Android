package id.yukngoding.explorepattern.useCase.rv

import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayList
import id.yukngoding.explorepattern.base.BaseViewModel
import id.yukngoding.explorepattern.di.network.SampleRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RecyclerViewVm(val repo: SampleRepo) : BaseViewModel() {

    //Data
    var listData: MutableList<String> = mutableListOf()

    //Adapter
    var adapter = Adapter()

    //Data for Adapter
    var itemList: ObservableArrayList<AdapterVm> = ObservableArrayList()

    fun callListData(v: View) {
        launch {
            repo.getListDataHewan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        it.hewan?.let { data ->
                            listData.addAll(data)
                            for (dataHewan in data) {
                                itemList.add(AdapterVm(dataHewan))
                            }
                            adapter.setValue(itemList)
                            adapter.notifyDataSetChanged()
                        }
                    },
                    { err ->
                        Log.e("Ikhwan", "error " + err.message)
                    })
        }
    }

}