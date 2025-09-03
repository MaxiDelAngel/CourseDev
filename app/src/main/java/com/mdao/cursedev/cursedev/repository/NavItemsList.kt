package com.mdao.cursedev.cursedev.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import com.mdao.cursedev.cursedev.ui.models.NavItems

object NavItemsList {
    val navItemsList = listOf(
        NavItems(
            label = "Inicio",
            icon = Icons.Filled.Home,
        ),
        NavItems(
            label = "Agregar",
            icon = Icons.Filled.AddCircle,
        ),
        NavItems(
            label = "Historial",
            icon = Icons.Filled.Info,
        ),
    )
}