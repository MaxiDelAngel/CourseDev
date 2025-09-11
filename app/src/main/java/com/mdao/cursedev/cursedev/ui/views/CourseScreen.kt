package com.mdao.cursedev.cursedev.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mdao.cursedev.R
import com.mdao.cursedev.ui.theme.MainColor
import com.mdao.cursedev.ui.theme.SecundColor

@Composable
fun CurseScreen(navigateToBack: () -> Boolean) {
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(modifier = Modifier.padding(start = 16.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "Icono flecha regresar",
                tint = MainColor,
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .size(24.dp)
                    .clickable {
                        navigateToBack()
                    }
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            CardScreen()
        }
    }
}

@Composable
fun CardScreen(
    title: String = "Titulo",
    code: String = "print('Hola Mundo')",
    content: String = "Contenido"
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp),
                ambientColor = SecundColor,
                spotColor = SecundColor
            ),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(title)
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ){
                Text(code, color = Color.White)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(content)
        }
    }
}