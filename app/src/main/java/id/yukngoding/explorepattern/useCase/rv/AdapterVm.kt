package id.yukngoding.explorepattern.useCase.rv

import android.view.View
import android.widget.Toast

data class AdapterVm(var item: String) {

    fun onClick(view: View) {
        Toast.makeText(view.context, "Click: $item", Toast.LENGTH_SHORT).show()
    }

}