package th.learn.expensy.compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import th.learn.expensy.R

@Composable
fun RecurringBillIcon(
    boxWidth: Dp = 60.dp,
    boxHeight:Dp = 60.dp,
    boxShape: Shape = RoundedCornerShape(15.dp),
    ){
    Box(
        modifier = Modifier
            .width(boxWidth)
            .height(boxHeight)
            .clip(boxShape)
            .background(colorResource(id = R.color.violet_20))
    ){
        Icon(
            painter = painterResource(id = R.drawable.recurring_bill),
            contentDescription = "Localized description",
            modifier = Modifier
                .size(60.dp)
                .padding(12.dp,12.dp,9.dp,12.dp)
                .align(Alignment.Center),
            tint = colorResource(id = R.color.violet_100)
        )
    }
}