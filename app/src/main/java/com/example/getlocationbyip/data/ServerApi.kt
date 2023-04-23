package com.example.getlocationbyip.data

import com.example.getlocationbyip.ui.LocationModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServerApi {
    @GET("{ip}")
    suspend fun getLocation(@Path("ip") ip: String, @Query("fields") fields: String) : Response<NetworkDataModel>
}