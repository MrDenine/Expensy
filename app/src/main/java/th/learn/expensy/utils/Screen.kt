package th.learn.expensy.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String?, val title: String?, val icon: ImageVector?) {
    object PickUp : Screen("pickup", "PickUp", Icons.Default.ShoppingCart)
    object Profile : Screen("profile", "Profile", Icons.Default.Person)
    object PickUp2 : Screen("pickup2", "PickUp", Icons.Default.ShoppingCart)
    object Profile2 : Screen("profile2", "Profile", Icons.Default.Person)
    object Camera:Screen("camera",null,null)

}