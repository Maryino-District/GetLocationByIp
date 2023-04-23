package com.example.getlocationbyip.data

import com.google.gson.annotations.SerializedName

data class NetworkDataModel(
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("city")
    val city: String? = null,
)