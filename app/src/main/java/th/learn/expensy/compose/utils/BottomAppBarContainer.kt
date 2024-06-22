package th.learn.expensy.compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomAppBar
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import th.learn.expensy.R

@Composable
fun BottomAppBarContainer() {
    val navController = rememberNavController()
    BottomAppBar(
        containerColor = Color.Transparent
    ) {
        BottomNav(navController = navController)
    }
}

@Composable
fun BottomNav(navController: NavController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    BottomNavigation(
        modifier = Modifier
            .height(90.dp)
            .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)),
        backgroundColor = colorResource(id = R.color.light_80),
        elevation = 0.dp
    ){

        Box (
            modifier = Modifier.padding(start = 10.dp, top = 15.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = "",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(id = R.color.violet_100)
                )
                Text(
                    text = "Home",
                    style = TextStyle(
                        color =  colorResource(id = R.color.violet_100),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }

        }

        Box (
            modifier = Modifier.padding( top = 15.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )  {
                Icon(
                    painter = painterResource(id = R.drawable.transaction),
                    contentDescription = "",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(id = R.color.light_20)

                )
                Text(
                    text = "Home",
                    style = TextStyle(
                        color =  colorResource(id = R.color.light_20),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }

        }
        Spacer(modifier = Modifier.width(40.dp))

        Box (
            modifier = Modifier.padding( top = 15.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.pie_chart),
                    contentDescription = "",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(id = R.color.light_20)
                )
                Text(
                    text = "Home",
                    style = TextStyle(
                        color =  colorResource(id = R.color.light_20),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }

        }

        Box (
            modifier = Modifier.padding(end = 10.dp , top = 15.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = "",
                    modifier = Modifier.size(35.dp),
                    tint = colorResource(id = R.color.light_20)
                )
                Text(
                    text = "Home",
                    style = TextStyle(
                        color =  colorResource(id = R.color.light_20),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BottomAppBarContainerPreview() {
    BottomAppBarContainer()
}