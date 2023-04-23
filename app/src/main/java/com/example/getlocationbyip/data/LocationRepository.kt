package com.example.getlocationbyip.data

import com.example.getlocationbyip.domain.Repository
import com.example.getlocationbyip.ui.LocationModel
import retrofit2.create

class LocationRepository : Repository {
    private val apiService = RetrofitClient.getInstance().create(ServerApi::class.java)

    override suspend fun getLocation(ip: String): LocationModel {
        val result = apiService.getLocation(ip, "status,country,city")
        return if (result.isSuccessful) {
            LocationModel(country = result.body()?.country, city = result.body()?.city)
        } else LocationModel(null, null)
    }
}