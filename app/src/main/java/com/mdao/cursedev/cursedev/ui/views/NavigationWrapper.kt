package com.mdao.cursedev.cursedev.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mdao.cursedev.cursedev.ui.models.AppScreens

@Composable
fun NavigationWrapper(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination= AppScreens.SplashScreen.route
    ){
        composable(AppScreens.MainScreen.route){
            MainScreen(
                navController = navHostController,
                navigateToCourse = { courseId ->
                    navHostController.navigate(AppScreens.CourseScreen.createRoute(courseId))
                }
            )
        }
        composable (AppScreens.SplashScreen.route){
            SplashScreen(navHostController)
        }
        composable(
            route = AppScreens.CourseScreen.route,
            arguments = listOf(navArgument("courseId") { type = NavType.IntType })
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getInt("courseId") ?: -1

            CourseScreen(
                courseId = courseId,
                navigateToBack = { navHostController.popBackStack() }
            )
        }
    }
}