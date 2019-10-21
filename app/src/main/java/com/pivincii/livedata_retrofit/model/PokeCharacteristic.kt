package com.pivincii.livedata_retrofit.model

import com.google.gson.annotations.SerializedName

data class PokeCharacteristic(
    @SerializedName("title") val title: String = "",
    @SerializedName("body") val body: String = ""
)