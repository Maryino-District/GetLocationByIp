package com.example.getlocationbyip.domain

import com.example.getlocationbyip.ui.LocationModel
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getLocation(ip: String) : Flow<LocationModel>
}