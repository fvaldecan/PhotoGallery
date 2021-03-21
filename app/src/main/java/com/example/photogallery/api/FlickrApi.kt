package com.example.photogallery.api

import com.example.photogallery.FlickrResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=b8f8f046810f6c43528f25d402b2e3f1" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")

    fun fetchPhotos(): Call<FlickrResponse>
    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>

}