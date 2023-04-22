package com.example.getlocationbyip.domain

import com.example.getlocationbyip.LocationRepository
import com.example.getlocationbyip.ui.LocationModel
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetLocationUseCaseTest {
    private lateinit var repository: Repository
    private lateinit var useCase: GetLocationUseCase
    @Before
    fun setUp() {
        repository = LocationRepository()
        useCase = GetLocationUseCase(repository)
    }
    @Test
    fun `execute south Korea ip must return south Korea`() = runBlocking {
        val testingResult = useCase.execute("121.174.200.102")
        val assertedResult = LocationModel(country = "South Korea", city = "Busanjin-gu")
        testingResult.collect {
            assertEquals(assertedResult, it)
        }
    }
}