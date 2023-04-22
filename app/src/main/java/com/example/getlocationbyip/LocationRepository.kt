package com.example.getlocationbyip

import com.example.getlocationbyip.domain.Repository
import com.example.getlocationbyip.ui.LocationModel
import kotlinx.coroutines.flow.Flow

class LocationRepository : Repository {
    override fun getLocation(ip: String): Flow<LocationModel> {
        TODO("Not yet implemented")
    }
}