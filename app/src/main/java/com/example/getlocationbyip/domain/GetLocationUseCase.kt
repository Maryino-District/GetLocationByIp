package com.example.getlocationbyip.domain

import com.example.getlocationbyip.ui.LocationModel
import kotlinx.coroutines.flow.Flow

class GetLocationUseCase(val repository: Repository) {
    fun execute(ip: String) : Flow<LocationModel> {
        return repository.getLocation(ip)
    }
}