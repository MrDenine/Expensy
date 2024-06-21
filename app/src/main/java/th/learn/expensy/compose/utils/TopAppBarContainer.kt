package th.learn.expensy.compose.utils

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import th.learn.expensy.R

@Composable
fun TopAppBarContainer(
    title:String
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(RoundedCornerShape(0.dp, 0.dp, 50.dp, 50.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        colorResource(id = R.color.yellow_20),
                        colorResource(id = R.color.light_80)
                    )
                )
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(650),
                    color = colorResource(id = R.color.dark_50)
                )
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Account Balance",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight =  FontWeight(650),
                    color = colorResource(id = R.color.light_20)
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "$9000",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight =  FontWeight(650),
                    color = colorResource(id = R.color.dark_75)
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row (
            ) {
                ValueBox(
                    iconResource = painterResource(id = R.drawable.income),
                    title = "Income",
                    value = "$9000",
                    color = colorResource(id = R.color.green_100)
                )

                Spacer(modifier = Modifier.width(10.dp))

                ValueBox(
                    iconResource = painterResource(id = R.drawable.income),
                    title = "Expenses",
                    value = "$9000",
                    color = colorResource(id = R.color.red_100)
                )


            }
        }
    }
}

@Composable
fun ValueBox(
    iconResource: Painter,
    title:String,
    value:String,
    color: Color
){
    Box (
        modifier = Modifier
            .width(166.dp)
            .clip(RoundedCornerShape(23.dp))
            .background(color)
    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(colorResource(id = R.color.light_100))
            ){
                Icon(
                    painter = iconResource,
                    contentDescription = "Localized description",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(3.dp)
                        .align(Alignment.Center),
                    tint = color
                )
            }

            Spacer(modifier = Modifier.width(5.dp))
            Column {
                Text(
                    text = title,
                    style = TextStyle(
                        color = colorResource(id = R.color.light_100)
                    )

                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = value,
                    style = TextStyle(
                        color = colorResource(id = R.color.light_100),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun TopAppBarContainerPreview(){
    TopAppBarContainer("Dashboard")
}