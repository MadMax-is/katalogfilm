package com.example.moviecatalog.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.moviecatalog.Constants
import com.example.moviecatalog.viewmodel.MovieViewModel

@Composable
fun DetailScreen(

    movieId: Int,

    viewModel: MovieViewModel =
        viewModel()

) {

    LaunchedEffect(Unit) {

        viewModel
            .getMovieDetail(movieId)
    }

    val movie =
        viewModel.selectedMovie

    movie?.let {

        Column(

            modifier = Modifier
                .verticalScroll(
                    rememberScrollState()
                )

        ) {

            AsyncImage(

                model =
                    Constants.IMAGE_BASE_URL +
                            it.poster_path,

                contentDescription = null,

                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
            )

            Column(
                Modifier.padding(16.dp)
            ) {

                Text(

                    it.title,

                    style =
                        MaterialTheme
                            .typography
                            .headlineMedium
                )

                Spacer(
                    Modifier.height(8.dp)
                )

                Text(
                    "⭐ ${it.vote_average}"
                )

                Text(
                    "Release: ${it.release_date}"
                )

                Spacer(
                    Modifier.height(16.dp)
                )

                Text(
                    it.overview
                )
            }
        }
    }
}
