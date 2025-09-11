package com.mdao.cursedev.cursedev.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mdao.cursedev.cursedev.ui.models.AppScreens

@Composable
fun NavigationWrapper(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination= AppScreens.SplashScreen.route
    ){
        composable(AppScreens.MainScreen.route){
            MainScreen(
                navHostController,
                navigateToCourse = { navHostController.navigate(AppScreens.CourseScreen.route) }
            )
        }
        composable (AppScreens.SplashScreen.route){
            SplashScreen(navHostController)
        }
        composable(AppScreens.CourseScreen.route){
            CurseScreen(
                navigateToBack = { navHostController.popBackStack() },
            )
        }
    }
}