package th.learn.expensy.compose.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import th.learn.expensy.compose.utils.TopAppBarContainer
import th.learn.expensy.R
import th.learn.expensy.compose.utils.TransactionItem

@Composable
fun HomeScreen(){
    Column {
        TopAppBarContainer(title = "Dashboard")

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp, 20.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recent Transaction",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonColors(
                    containerColor = colorResource(id = R.color.violet_20),
                    contentColor = colorResource(id = R.color.violet_100),
                    disabledContentColor = colorResource(id = R.color.light_20),
                    disabledContainerColor = colorResource(id = R.color.dark_25),
                )
            ) {
                Text(
                    text = "See All",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 18.sp
                    )
                )
            }
        }
        LazyColumn {
            item {
                TransactionItem()
                TransactionItem()
                TransactionItem()
                TransactionItem()
                TransactionItem()
                TransactionItem()
                TransactionItem()
            }

        }

    }
}