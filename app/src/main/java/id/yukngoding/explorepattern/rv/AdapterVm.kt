package id.yukngoding.explorepattern.rv

import android.view.View
import android.widget.Toast

data class AdapterVm(var listItem: Pojo) {

    fun onClick(view: View) {
        Toast.makeText(view.context, "Click: ${listItem.teks}", Toast.LENGTH_SHORT).show()
    }

}