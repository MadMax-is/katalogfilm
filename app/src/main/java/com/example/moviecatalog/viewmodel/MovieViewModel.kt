package com.example.moviecatalog.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviecatalog.model.Movie
import com.example.moviecatalog.repository.MovieRepository
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    private val repository =
        MovieRepository()

    var movieList by mutableStateOf<List<Movie>>(
        emptyList()
    )
        private set


    var selectedMovie by mutableStateOf<Movie?>(
        null
    )
        private set


    init {

        getMovies()
    }


    private fun getMovies() {

        viewModelScope.launch {

            try {

                movieList =
                    repository
                        .getPopularMovies()
                        .results

            } catch (e: Exception) {

                e.printStackTrace()
            }
        }
    }


    fun getMovieDetail(id: Int) {

        viewModelScope.launch {

            selectedMovie =
                repository.getMovieDetail(id)
        }
    }
}