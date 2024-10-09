package com.sumitranjan.bqankinguijetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sumitranjan.bqankinguijetpack.ui.theme.BqankingUiJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BqankingUiJetpackTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){

                }
            }
        }
    }
    @Composable
    private fun SetBarColor(color: Color){
        val systemUiController = rememberSystemUiController()
        SideEffect {
             systemUiController.setSystemBarsColor(
                 color=color
             )
        }
    }
}
@Preview
@Composable
fun HomeScreen(){
    Scaffold(
        bottomBar = {
         BottomNavigationBar()
        }
    ) { padding ->
        Column(
         modifier = Modifier.fillMaxSize()
             .padding(padding)
        ) {

        }
      //WalletSection()
      //CardSection()
        Spacer(modifier = Modifier.height(16.dp))
      //FinanceSection()
      //CurrencySection()
    }
}