package com.example.cryptoapp.domain.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Patrick Adutwum on 16/11/2022.
 */
data class Coin(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
