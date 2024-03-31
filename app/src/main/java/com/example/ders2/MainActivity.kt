package com.example.ders2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ders2.ui.theme.Ders2Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ders2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScientistList()
                }
            }
        }
    }
}

@Composable
fun ScientistList(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "scientists"){
        composable("scientists"){
            ScientistCard(scientists[0],navController=navController)
        }
        composable("scientists/${scientists[0].name}"){
            ScientistCard(scientists[1],navController=navController)
        }
        composable("scientists/${scientists[1].name}"){
            ScientistCard(scientists[2],navController=navController)
        }
        composable("scientists/${scientists[2].name}"){
            ScientistCard(scientists[3],navController=navController)
        }
        composable("scientists/${scientists[3].name}"){
            ScientistCard(scientists[4],navController=navController)
        }
    }

}

