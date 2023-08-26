package com.nx.nxretrofit2.data

import com.nx.nxretrofit2.core.Constant.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

}