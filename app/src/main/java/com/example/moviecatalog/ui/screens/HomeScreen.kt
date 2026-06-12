package com.example.moviecatalog.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.moviecatalog.ui.components.MovieCard
import com.example.moviecatalog.ui.components.ProfileSection
import com.example.moviecatalog.viewmodel.MovieViewModel

@Composable
fun HomeScreen(

    navController: NavController,

    viewModel: MovieViewModel =
        viewModel()

) {

    Column {

        ProfileSection()

        LazyColumn {

            items(
                viewModel.movieList
            ) { movie ->

                MovieCard(
                    movie = movie
                ) {

                    navController.navigate(
                        "detail/${movie.id}"
                    )
                }
            }
        }
    }
}
