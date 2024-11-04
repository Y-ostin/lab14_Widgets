package com.example.lab14_widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.glance.text.Text


class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsScreen() // Aquí define la pantalla de ajustes
        }
    }
}

@Composable
fun SettingsScreen() {
    Text(text = "Pantalla de Ajustes")
}