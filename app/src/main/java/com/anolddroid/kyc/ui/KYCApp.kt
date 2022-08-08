package com.anolddroid.kyc.ui

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.anolddroid.kyc.ui.components.KYCScaffold
import com.anolddroid.kyc.ui.theme.KYCTheme
import com.google.accompanist.insets.ProvideWindowInsets

@Composable
fun KYCApp() {
    ProvideWindowInsets {
        KYCTheme {
            val scaffoldState = rememberScaffoldState()
            val navController = rememberNavController()
            val coroutineScope = rememberCoroutineScope()
           KYCScaffold(
                scaffoldState = scaffoldState,
            ){
                KYCNavGraph(
                    navController = navController,
                    scaffoldState = scaffoldState,
                    coroutineScope = coroutineScope
                )
            }
        }
    }
}
