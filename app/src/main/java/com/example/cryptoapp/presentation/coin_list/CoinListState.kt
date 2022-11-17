package com.example.cryptoapp.presentation.coin_list

import com.example.cryptoapp.domain.model.Coin

/**
 * Created by Patrick Adutwum on 16/11/2022.
 */
data class CoinListState(
   val isLoading : Boolean = false,
   val coins: List<Coin> = emptyList(),
   val error: String = ""
)
