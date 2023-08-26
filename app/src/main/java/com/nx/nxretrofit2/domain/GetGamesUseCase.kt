package com.nx.nxretrofit2.domain

import com.nx.nxretrofit2.repository.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(
    private val gameRepository: GameRepository
) {
    suspend operator fun invoke(): List<GameItem> {
        return gameRepository.getGames().shuffled()
    }
}