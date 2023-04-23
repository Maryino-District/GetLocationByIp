package com.example.getlocationbyip.domain

import com.example.getlocationbyip.ui.LocationModel
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun getLocation(ip: String) : LocationModel
}