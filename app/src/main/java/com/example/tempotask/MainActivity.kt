package com.example.tempotask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tempotask.ui.theme.TempotaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TempotaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Hugo")
                    MainScreen()
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TempotaskTheme {
        Greeting("Android")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    // Scaffold básico
    Scaffold(
        topBar = {
            // Barra de la aplicación
            TopAppBar(
                title = { Text(text = "Ejemplo") },
                navigationIcon = {
                    // Icono de navegación (flecha hacia atrás)
                    Icon(Icons.Default.ArrowBack, contentDescription = null)
                },
                actions = {
                    // Iconos adicionales en la barra de la aplicación (icono de casa)
                    Icon(Icons.Default.Home, contentDescription = null)
                }
            )
        },
        content = {
            // Contenido principal de la pantalla
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Texto
                Text(
                    text = "¡Hola, Hugo!"
                )

                // Imagen(Con un placeholder transparente)
                Image(
                    painter = painterResource(id = android.R.color.transparent),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)

                )

                // Lista de elementos
                LazyColumn {
                    items(10) {
                        Text(text = "Elemento $it")
                    }
                }
            }
        }
    )
}
