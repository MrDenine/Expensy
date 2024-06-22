package th.learn.expensy.compose.utils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import th.learn.expensy.R

@Composable
fun FloatingCenterAppBarButton(){
    Box {
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.Center)
                .size(80.dp)
                .offset(y = 65.dp),
            shape = CircleShape,
            contentColor = colorResource(id = R.color.light_100),
            containerColor = colorResource(id = R.color.violet_100),
            content = {
                Icon(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "Add icon"
                )
            },
            onClick = {

            }
        )
    }
}