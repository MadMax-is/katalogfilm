package com.example.moviecatalog.ui.components

import com.example.moviecatalog.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun ProfileSection() {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)

    ) {

        Row(

            modifier = Modifier
                .padding(16.dp),

            verticalAlignment =
                Alignment.CenterVertically

        ) {

            Image(
                painter = painterResource(R.drawable.fotoprofile),
                contentDescription = "Profile",
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
            )

            Spacer(
                Modifier.width(16.dp)
            )

            Column {

                Text(
                    "Agung Dwi Putra",
                    fontWeight =
                        FontWeight.Bold
                )

                Text(
                    "G211240006"
                )
            }
        }
    }
}
