package com.example.doctoappointmentproject.navigation.routes

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doctoappointmentproject.core.viewModel.MainViewModel
import com.example.doctoappointmentproject.feature.home.MainScreen
import com.example.doctoappointmentproject.navigation.Screen

fun NavGraphBuilder.homeRoute(
    vm: MainViewModel,
) {
    composable(Screen.Home.route) {
        val categories by vm.category.observeAsState(initial = emptyList())

        LaunchedEffect(Unit) {
            if (categories.isEmpty()) {
                vm.loadCategory()
            }
        }

        MainScreen(viewModel = vm)

    }
}
