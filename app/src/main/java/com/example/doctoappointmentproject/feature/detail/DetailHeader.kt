package com.example.doctoappointmentproject.feature.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.doctoappointmentproject.R

@Composable
fun DetailHeader(
    pictureUrl: String?,
    onBack: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .background(colorResource(R.color.purple))
            .statusBarsPadding()
    ) {
        IconButton(
            onClick = onBack,
            modifier = Modifier
                .align(alignment = TopStart)
                .padding(start = 16.dp, top = 8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.back_white),
                contentDescription = null,
                tint = Color.Unspecified
            )
        }

        IconButton(
            onClick = {},
            modifier = Modifier
                .align(alignment = TopEnd)
                .padding(end = 16.dp, top = 8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.favorite_white),
                contentDescription = null,
                tint = Color.Unspecified
            )
        }

        AsyncImage(
            model = pictureUrl,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
        )

    }
}