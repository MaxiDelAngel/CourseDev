package com.mdao.cursedev.cursedev.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mdao.cursedev.cursedev.ui.models.AppScreens

@Composable
fun NavigationWrapper(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination= AppScreens.SplashScreen.route
    ){
        composable(AppScreens.MainScreen.route){
            MainScreen(navHostController)
        }
        composable (AppScreens.SplashScreen.route){
            SplashScreen(navHostController)
        }
    }
}