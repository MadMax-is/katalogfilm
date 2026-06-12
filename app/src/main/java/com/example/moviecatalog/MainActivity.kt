package com.example.moviecatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.moviecatalog.navigation.NavGraph
import com.example.moviecatalog.ui.theme.MovieCatalogAppTheme

class MainActivity :
    ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {

        super.onCreate(
            savedInstanceState
        )

        setContent {

            MovieCatalogAppTheme {

                NavGraph()
            }
        }
    }
}
