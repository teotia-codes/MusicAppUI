package com.example.musicappui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells

import androidx.compose.ui.Modifier

@Composable
fun BrowseScreen(){
    val categories = listOf<String>(
        "Hits", "Happy", "Workout", "Running", "TGIF", "Yoga"
    )
    LazyVerticalGrid(columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        content = {
            items(categories){
              BrowserItem(cat = it, drawable = R.drawable.baseline_apps_24)
            }
        })
}


@Preview(showBackground = true)
@Composable
fun BrowsePrew(){
    BrowseScreen()
}