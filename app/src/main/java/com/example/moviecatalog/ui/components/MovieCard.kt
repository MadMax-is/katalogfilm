package com.example.moviecatalog.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.moviecatalog.Constants
import com.example.moviecatalog.model.Movie

@Composable
fun MovieCard(

    movie: Movie,

    onClick: () -> Unit

) {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onClick()
            }

    ) {

        Row {

            AsyncImage(
                model = "${Constants.IMAGE_BASE_URL}${movie.poster_path}",
                contentDescription = movie.title,
                modifier = Modifier
                    .width(120.dp)
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .padding(top = 50.dp)  // Geser ke bawah
            ) {

                Text(
                    text = movie.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "⭐ ${movie.vote_average}",
                    color = Color(0xFFFFC107)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(movie.release_date)
            }
        }
    }
}
