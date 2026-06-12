package com.example.moviecatalog.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviecatalog.ui.screens.DetailScreen
import com.example.moviecatalog.ui.screens.HomeScreen

@Composable
fun NavGraph() {

    val navController =
        rememberNavController()

    NavHost(

        navController =
            navController,

        startDestination =
            "home"

    ) {

        composable("home") {

            HomeScreen(
                navController
            )
        }

        composable(

            "detail/{movieId}"

        ) {

            val movieId =

                it.arguments
                    ?.getString(
                        "movieId"
                    )
                    ?.toInt() ?: 0

            DetailScreen(
                movieId
            )
        }
    }
}
