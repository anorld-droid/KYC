package com.anolddroid.kyc.model

import android.os.Parcelable
import com.anolddroid.kyc.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Constituency(
    val name:String,
    val image: String,
    val drawable: Int,
): Parcelable

val Constituencies = listOf<Constituency>(
    Constituency(name = "Cherengany Constituency", drawable = R.drawable.splash_screen_image, image = "https://victormatara.com/wp-content/uploads/2019/02/Saiwa-Swamp-National-Park.jpg"),
    Constituency(name = "Kwanza Constituency",  drawable = R.drawable.splash_screen_image,image = "https://pbs.twimg.com/media/DzoJwQgWwAEAbrL.jpg:large"),
    Constituency(name = "Saboti Constituency",  drawable = R.drawable.splash_screen_image,image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9upZw2oBtvkLtPSimnMstFfsIEZp0dmcKdw&usqp=CAU"),
Constituency(name = "Endebess Constituency",  drawable = R.drawable.splash_screen_image,image = "https://www.planning.go.ke/wp-content/uploads/2021/03/Transnzoia-County-Feb212.jpg"),
Constituency(name = "Kiminini Constituency",  drawable = R.drawable.splash_screen_image,image = "https://media.jumiadeals.com/ke_live/eee279146d60a4ce7e8af58.mobile-gallery-large.jpg"),
    )