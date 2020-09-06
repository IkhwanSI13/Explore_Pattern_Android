package id.yukngoding.explorepattern.di.network

import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("_dev/sample_api_hewan.php")
    fun getListDataHewan(
            @Body body: RequestBody
    ): Observable<HewanDao>

}