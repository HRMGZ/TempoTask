package com.example.tempotask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
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
                    MainScreen()
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TempotaskTheme {
        MainScreen()
    }
}

@OptIn(ExperimentalMaterial3Api::class) // Para usar el nuevo Material Design 3 (TopAppBar)
@Composable
fun MainScreen() {
    // Scaffold básico
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Top app bar")
                }
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                    Nulla facilisi. Donec euismod, nisl eget tempor aliquam, 
                    nunc nisl ultricies nunc, quis aliquam nunc nisl quis 
                    nunc. Sed euismod, nisl eget tempor aliquam, nunc nisl 
                    ultricies nunc, quis aliquam nunc nisl quis nunc. Sed 
                    euismod, nisl eget tempor aliquam, nunc nisl ultricies 
                    nunc, quis aliquam nunc nisl quis nunc. Sed euismod, nisl 
                    eget tempor aliquam, nunc nisl ultricies nunc, quis 
                    aliquam nunc nisl quis nunc. Sed euismod, nisl eget tempor 
                    aliquam, nunc nisl ultricies nunc, quis aliquam nunc nisl 
                    quis nunc. Sed euismod, nisl eget tempor aliquam, nunc 
                    nisl ultricies nunc, quis aliquam nunc nisl quis nunc. Sed 
                    euismod, nisl eget tempor aliquam, nunc nisl ultricies 
                    nunc, quis aliquam nunc nisl quis nunc. Sed euismod, nisl 
                    eget tempor aliquam, nunc nisl ultricies nunc, quis 
                    aliquam nunc nisl quis nunc. Sed euismod, nisl eget tempor 
                    aliquam, nunc nisl ultricies nunc, quis aliquam nunc nisl 
                    quis nunc. Sed euismod, nisl eget tempor aliquam, nunc 
                    nisl ultricies nunc, quis aliquam nunc nisl quis nunc. Sed 
                    euismod, nisl eget tempor aliquam, nunc nisl ultricies 
                    nunc, quis aliquam nunc nisl quis nunc. Sed euismod, nisl 
                    eget tempor aliquam, nunc nisl ultricies nunc, quis 
                    aliquam nunc nisl quis nunc. Sed euismod, nisl eget tempor 
                    aliquam, nunc nisl ultricies nunc, quis aliquam nunc nisl 
                    quis nunc. Sed euismod, nisl eget tempor aliquam, nunc 
                    nisl ultricies nunc, quis aliquam nunc nisl quis nunc. Sed
                """.trimIndent()
            )
            Image(
                    painter = painterResource(id = android.R.color.transparent),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.primary)
            )
            LazyColumn(content = {
                items(10) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = "Item $it"
                    )
                }
            })

        }
    }
}
