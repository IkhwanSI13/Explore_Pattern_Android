package id.yukngoding.explorepattern.useCase.rv

import androidx.databinding.ObservableArrayList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.yukngoding.explorepattern.databinding.ItemBinding

class Adapter : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    private var itemList = ObservableArrayList<AdapterVm>()
    private var layoutInflater: LayoutInflater? = null

    fun setValue(data: ObservableArrayList<AdapterVm>) {
        itemList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        return MyViewHolder(ItemBinding.inflate(layoutInflater!!, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val newsVm = itemList[position]
        holder.bind(newsVm)
    }

    override fun getItemCount(): Int = itemList.size

    class MyViewHolder(private val itemBinding: ItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(hewanVm: AdapterVm) {
            this.itemBinding.vm = hewanVm
        }
    }

}