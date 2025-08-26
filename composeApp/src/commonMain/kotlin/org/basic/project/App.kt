package org.basic.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmpbasico.composeapp.generated.resources.Res
import kmpbasico.composeapp.generated.resources.compose_multiplatform
import kotlin.native.CName
import kotlin.time.Duration.Companion.days

@Composable
fun App() {
    MaterialTheme {

        var name: String by remember { mutableStateOf("") }
        var lastname: String by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = {
                    Text("Ingrese nombre")
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

            AnimatedVisibility(name.isNotEmpty()) {
                Text(
                    text = "Nombre: $name",
                    fontSize = 20.sp
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            TextField(
                value = lastname,
                onValueChange = {
                    lastname = it
                },
                label = {
                    Text("Ingrese apellido")
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

            AnimatedVisibility(lastname.isNotEmpty()) {
                Text(
                    text = "Apellido: $lastname",
                    fontSize = 20.sp
                )
            }
        }
    }
}