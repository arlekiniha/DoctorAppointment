package com.example.doctoappointmentproject.feature.home

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doctoappointmentproject.R

@Composable
fun HomeBottomBar(
    modifier: Modifier = Modifier,
    selected: Int,
    onSelect: (Int) -> Unit
) {
    NavigationBar(
        containerColor = colorResource(R.color.lightGray),
        tonalElevation = 1.dp,
        windowInsets = WindowInsets(left = 0.dp),
        modifier = Modifier.height(60.dp),

        ) {
        val titles = listOf<String>("Explorer", "Wishlist", "Settings", "Account")
        val icons = listOf(
            R.drawable.btn_1,
            R.drawable.btn_2,
            R.drawable.btn_3,
            R.drawable.btn_4,
        )

        titles.forEachIndexed { index, title ->
            NavigationBarItem(
                selected = selected == index,
                onClick = { onSelect(index) },
                icon = {
                    Icon(
                        painter = painterResource(icons[index]),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.height(22.dp)
                    )
                },

                label = {
                    Text(text = " ", fontSize = 10.sp, color = Color.Black)
                },

                alwaysShowLabel = true
            )
        }
    }}

@Preview
@Composable
private fun HomeBottomBarPreview() {
    HomeBottomBar(selected = 0, onSelect = {})
}




