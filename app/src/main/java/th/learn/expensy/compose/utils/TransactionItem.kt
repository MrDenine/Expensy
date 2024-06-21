package th.learn.expensy.compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import th.learn.expensy.R

@Composable
fun TransactionItem(
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(colorResource(id = R.color.light_80))
    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RecurringBillIcon()
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "Shopping",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.dark_25)
                        )
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Buy some grocery",
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = colorResource(id = R.color.light_20)
                        )
                    )
                }
            }
            Column(
                modifier = Modifier.padding(0.dp,0.dp,10.dp,0.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "- \$120",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.red_100)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "10:00 AM",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.light_20)
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun TransactionItemPreview(){
    TransactionItem()
}