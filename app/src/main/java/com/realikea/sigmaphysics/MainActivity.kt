package com.realikea.sigmaphysics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.realikea.sigmaphysics.component.BottomNavigate
import com.realikea.sigmaphysics.ui.theme.SigmaPhysicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SigmaPhysicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SigmaPhysicsApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SigmaPhysicsApp(modifier: Modifier) {
    SigmaPhysicsTheme {
        Scaffold(bottomBar = { BottomNavigate(modifier = Modifier,) }) { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KYSPreview() {
    SigmaPhysicsApp(modifier = Modifier)
    }
