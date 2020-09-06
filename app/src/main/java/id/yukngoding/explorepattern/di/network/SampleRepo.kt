package id.yukngoding.explorepattern.di.network

import com.google.gson.JsonObject
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.RequestBody

class SampleRepo(val apiInterface: ApiInterface) {

    fun getListDataHewan(): Observable<HewanDao> {
        val jsonObject = JsonObject()
        jsonObject.addProperty("id", 1)
        return apiInterface.getListDataHewan(
            RequestBody.create(
                MediaType.parse("application/json"),
                jsonObject.toString()
            )
        )
    }

}