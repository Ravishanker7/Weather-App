package com.example.weather

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier


enum class tabrows(
    val text: String) {
    today(text = "Today"),
    tommorow(text = "Tommorow"),
    nextday(text = "Next 7 days")
}
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun row(){
    val pagerState= rememberPagerState(
        initialPage = 0
    )
    val coroutoneScope= rememberCoroutineScope()
    val selecttedTabindex= remember { pagerState.currentPage }


    TabRow(selectedTabIndex = pagerState.currentPage) {
        Tab(selected = pagerState.currentPage==0,
            text = {
                Text(text = "Today")
            },
            onClick = {

            })
    }
}