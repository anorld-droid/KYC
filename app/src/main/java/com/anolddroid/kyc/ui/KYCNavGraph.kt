package com.anolddroid.kyc.ui

import android.os.Bundle
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.ui.views.details.ConstituencyDetail
import com.anolddroid.kyc.ui.views.details.showImage
import com.anolddroid.kyc.ui.views.home.Home
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import java.net.URLDecoder
import java.nio.charset.StandardCharsets


object Destinations {
    const val home = "ui/views/home/Home"
    const val showImage = "ui/views/details/FullScreenImage"
    const val constituencyDetails = "ui/views/details/ConstituencyDetails"
}

@Composable
fun KYCNavGraph(
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Destinations.home
    ) {
        composable(Destinations.home) {
            Home(
                navController = navController
            )
        }
        composable(
            "${Destinations.constituencyDetails}/{constituency}",
            arguments = listOf(
                navArgument("constituency") {
                    type = AssertParamType()
                })
        ) { backStackEntry ->
            val constituency = backStackEntry.arguments?.getParcelable<Constituency>("constituency")
            if (constituency != null) {
                ConstituencyDetail(constituency = constituency, navController = navController)
            }
        }
        composable("${Destinations.showImage}/{image}") { navBackStackEntry ->
            val imageUrl = navBackStackEntry.arguments?.getString("image")
            if (imageUrl != null) {
                val url = URLDecoder.decode(imageUrl, StandardCharsets.UTF_8.toString())
                showImage(imageUrl = url, navController = navController)
            }

        }
    }
}

class AssertParamType : NavType<Constituency>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): Constituency? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): Constituency {
        return Gson().fromJson(value, Constituency::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: Constituency) {
        bundle.putParcelable(key, value)
    }

}