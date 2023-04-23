package com.example.getlocationbyip.domain

import com.example.getlocationbyip.ui.LocationModel
import kotlinx.coroutines.flow.Flow

class GetLocationUseCase(val repository: Repository) {
    suspend fun execute(ip: String) : LocationModel {
        return repository.getLocation(ip)
    }
}