package com.example.cryptoapp.presentation.coin_detail

import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail

/**
 * Created by Patrick Adutwum on 16/11/2022.
 */
data class CoinDetailState(
   val isLoading : Boolean = false,
   val coin: CoinDetail? = null,
   val error: String = ""
)
