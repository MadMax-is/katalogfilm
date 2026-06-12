package com.example.moviecatalog.network

import com.example.moviecatalog.model.Movie
import com.example.moviecatalog.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(

        @Query("api_key")
        apiKey: String

    ): MovieResponse


    @GET("movie/{id}")
    suspend fun getMovieDetail(

        @Path("id")
        id: Int,

        @Query("api_key")
        apiKey: String

    ): Movie
}