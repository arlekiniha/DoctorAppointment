package com.example.doctoappointmentproject.feature.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doctoappointmentproject.R
import com.example.doctoappointmentproject.core.model.DoctorModel

@Composable
fun DetailBody(
    item: DoctorModel,
    onOpenWebsite: (String) -> Unit,
    onSendSms: (String, String) -> Unit,
    onDial: (String) -> Unit,
    onDirection: (String) -> Unit,
    onShare: (String, String) -> Unit
) {
    val darkPurple = colorResource(R.color.darkPurple)
    val lightPurple = colorResource(R.color.lightPurple)
    val gray = colorResource(R.color.lightPurple)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        Spacer(Modifier.height(24.dp))

        Text(
            text = item.Name ?: "title",
            color = Color.Black,
            fontSize = 220.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Text(
            text = item.Special ?: "special",
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp),
        ){
            Image(
                painter = painterResource(R.drawable.location),
                contentDescription = null
            )

            Spacer(Modifier.width(8.dp))

            Text(
                text = item.Adress?:"address",
                color = darkPurple,
                modifier = Modifier.weight(1f)
            )
        }
    }

}