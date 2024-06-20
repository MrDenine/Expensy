package th.learn.expensy.compose.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import th.learn.expensy.compose.utils.TopAppBarContainer

@Composable
fun HomeScreen(){
    TopAppBarContainer(title = "Dashboard")
}