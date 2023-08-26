package com.nx.nxretrofit2.repository

import com.nx.nxretrofit2.data.GameService
import com.nx.nxretrofit2.domain.GameItem
import com.nx.nxretrofit2.domain.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(
    private val gameService: GameService
) {
    suspend fun getGames(): List<GameItem> {
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}