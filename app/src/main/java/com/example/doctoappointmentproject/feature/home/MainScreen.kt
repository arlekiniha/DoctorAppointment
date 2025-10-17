package com.example.doctoappointmentproject.feature.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.doctoappointmentproject.core.viewModel.MainViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    val categories by viewModel.category.observeAsState(initial = emptyList())
    val doctors by viewModel.doctors.observeAsState(initial = emptyList())

    LaunchedEffect(Unit) {
        if (doctors.isEmpty()) {
            viewModel.loadDoctors()
        }
    }


    LaunchedEffect(Unit) {
        if (categories.isEmpty()) {
            viewModel.loadCategory()
        }
    }

    var selectedBottom by remember { mutableStateOf(0) }

    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            HomeBottomBar(
                selected = selectedBottom,
                onSelect = { selectedBottom = it }
            )
        }
    ) { inner ->
        LazyColumn(contentPadding = inner) {
            item {
                HomeHeader()
            }
            item {
                Banner()
            }
            item {
                SectionHeader(title = "Doctor Speciality", onSeeAll = null)
            }
            item {CategoryRow(categories)}

        }
    }
}

@Preview
@Composable
private fun MainScreen() {
    MainScreen()
}