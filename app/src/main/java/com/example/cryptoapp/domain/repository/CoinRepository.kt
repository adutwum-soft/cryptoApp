package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.remote.dto.CoinDetailDto
import com.example.cryptoapp.data.remote.dto.CoinDto

/**
 * Created by Patrick Adutwum on 16/11/2022.
 */
interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}