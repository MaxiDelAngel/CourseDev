package com.mdao.cursedev.cursedev.ui.models

sealed class AppScreens(val route: String) {
    object MainScreen: AppScreens("main_screen")
    object SplashScreen: AppScreens("splash_screen")
    object CourseScreen : AppScreens("course_screen/{courseId}") {
        fun createRoute(courseId: Int) = "course_screen/$courseId"
    }
}