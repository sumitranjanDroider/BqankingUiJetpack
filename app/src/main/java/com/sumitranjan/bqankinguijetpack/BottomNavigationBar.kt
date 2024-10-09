package com.sumitranjan.bqankinguijetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sumitranjan.bqankinguijetpack.data.BottomNavigationItem

val items= listOf(
    BottomNavigationItem("Home", Icons.Rounded.Home),
    BottomNavigationItem("Wallet", Icons.Rounded.Wallet),
            BottomNavigationItem("Notification", Icons.Rounded.Notifications),
    BottomNavigationItem("Account", Icons.Rounded.AccountCircle)
)

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row (
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseSurface)
        ){

            items.forEachIndexed{ index,item ->
                NavigationBarItem(
                    selected = index ==0,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )

            }
        }
    }
}