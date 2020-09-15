package id.yukngoding.explorepattern.di.module.api

import id.yukngoding.explorepattern.model.NewsModel
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.SingleObserver
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    fun getData(): Single<List<NewsModel>>

}