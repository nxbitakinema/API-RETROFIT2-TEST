package com.nx.nxretrofit2.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nx.nxretrofit2.domain.GameItem

@Composable
fun HomeScreen() {

    val homeViewModel = viewModel(modelClass = HomeViewModel::class.java)
    val games by homeViewModel.games.collectAsState()

    LazyColumn {
        items(games) { game: GameItem ->
            GameCard(game = game)
        }
    }
}