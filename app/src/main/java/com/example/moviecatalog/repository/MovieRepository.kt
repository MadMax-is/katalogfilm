package com.example.moviecatalog.repository

import com.example.moviecatalog.Constants
import com.example.moviecatalog.network.RetrofitClient

class MovieRepository {

    suspend fun getPopularMovies() =

        RetrofitClient.api
            .getPopularMovies(Constants.API_KEY)


    suspend fun getMovieDetail(id: Int) =

        RetrofitClient.api
            .getMovieDetail(
                id,
                Constants.API_KEY
            )
}