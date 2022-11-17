package com.example.cryptoapp.presentation

/**
 * Created by Patrick Adutwum on 16/11/2022.
 */
sealed class Screen(val route: String){
	object CoinListScreen: Screen("coin_list_screen")
	object CoinDetailScreen: Screen("coin_detail_screen")
}
