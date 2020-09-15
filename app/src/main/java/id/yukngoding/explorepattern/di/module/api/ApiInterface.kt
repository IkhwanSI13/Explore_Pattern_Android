package id.yukngoding.explorepattern.di.module.api

import id.yukngoding.explorepattern.model.NewsModel
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    fun getData(): Observable<List<NewsModel>>

}