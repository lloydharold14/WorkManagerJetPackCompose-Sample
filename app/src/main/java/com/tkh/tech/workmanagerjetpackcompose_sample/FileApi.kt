package com.tkh.tech.workmanagerjetpackcompose_sample

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/api/character/avatar/102.jpeg")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com")
                .build()
                .create(FileApi::class.java)
        }
    }
}