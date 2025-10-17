package com.example.doctoappointmentproject.navigation.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doctoappointmentproject.feature.intro.IntroScreen
import com.example.doctoappointmentproject.navigation.Screen

fun NavGraphBuilder.introRoute(onStart: () -> Unit) {
    composable(Screen.Intro.route) {
        IntroScreen(onStartClick = onStart)

    }
}