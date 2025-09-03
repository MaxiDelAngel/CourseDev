package com.mdao.cursedev.cursedev.ui.models

sealed class AppScreens(val route: String) {
    object MainScreen: AppScreens("main_screen")
    object SplashScreen: AppScreens("splash_screen")
}