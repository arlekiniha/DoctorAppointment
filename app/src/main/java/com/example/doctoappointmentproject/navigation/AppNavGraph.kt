package com.example.doctoappointmentproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.doctoappointmentproject.core.viewModel.MainViewModel
import com.example.doctoappointmentproject.navigation.routes.homeRoute
import com.example.doctoappointmentproject.navigation.routes.introRoute

@Composable
fun AppNavGraph(
    nav: NavHostController,
    vm: MainViewModel,
    modifier: Modifier = Modifier
) {
    NavHost(navController = nav, startDestination = Screen.Intro.route) {
        introRoute(
            onStart ={
                nav.navigate(Screen.Home.route){
                    popUpTo(Screen.Intro.route){
                        inclusive = true
                    }
                }
            }
        )

        homeRoute(vm = vm)
    }
}