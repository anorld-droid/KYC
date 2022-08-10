package com.anolddroid.kyc.model

import android.os.Parcelable
import com.anolddroid.kyc.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Constituency(
    val name: String,
    val image: String,
    val drawable: Int,
    val leader: Leader,
    val wards: List<Leader>
) : Parcelable

val Constituencies = listOf(
    Constituency(
        name = "Cherengany Constituency",
        leader = Leader("Member of Parliament", "Joshua Kipserem Kutuny",
            image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
        ),
        drawable = R.drawable.splash_screen_image,
        image = "https://victormatara.com/wp-content/uploads/2019/02/Saiwa-Swamp-National-Park.jpg",
        wards = listOf(
            Leader("MCA Chereng'any Ward", "Wanjala Paul Masika", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Kaplamai Ward", "Kitereme Kungungulu", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Chepsiro Ward", "Wakwa Sheila K.", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Sinyerere Ward", "Simiyu Philemon", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Sitatunga Ward", "Lucky Terry L.", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Nzoia Ward", "Satia J. Moses", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Makutano Ward ", "Nyongesa Philip", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            )
    ),
    Constituency(
        name = "Kwanza Constituency",
        leader = Leader("Member of Parliament", "Ferdinard K Wanyonyi",
            image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
        ),
        drawable = R.drawable.splash_screen_image,
        image = "https://pbs.twimg.com/media/DzoJwQgWwAEAbrL.jpg:large",
        wards = listOf(
            Leader("MCA Kapomboi Ward", "Joy M Mich", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Keiyo Ward", "Shadrack N. Silwa", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Kwanza Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Bidii Ward", "Samuel K. Wambui", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
        )
    ),
    Constituency(
        name = "Saboti Constituency",
        leader = Leader("Member of Parliament", "Caleb A. Liyai",
            image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
        ),
        drawable = R.drawable.splash_screen_image,
        wards = listOf(
            Leader("MCA Kinyoro Ward", "Samuel K. Wambui", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Machewa Ward", "Joy M Mich", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Matisi Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Saboti Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Tuwani Ward", "Shadrack N. Silwa", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),


            ),
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9upZw2oBtvkLtPSimnMstFfsIEZp0dmcKdw&usqp=CAU"
    ),
    Constituency(
        name = "Endebess Constituency",
        leader = Leader("Member of Parliament", "Robert Pukose",
            image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
        ),
        wards = listOf(
            Leader("MCA Chepchoina Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Endebess Ward", "Joy M Mich", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Matumbei Ward", "Shadrack N. Silwa", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),

            ),
        drawable = R.drawable.splash_screen_image,
        image = "https://www.planning.go.ke/wp-content/uploads/2021/03/Transnzoia-County-Feb212.jpg"
    ),
    Constituency(
        name = "Kiminini Constituency",
        leader = Leader("Member of Parliament", "Chris Wamalwa",
            image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
        ),
        wards = listOf(
            Leader("MCA Hospital Ward", "Shadrack N. Silwa", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Kiminini Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Nabiswa Ward", "Joy M Mich", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Sikhendu Ward", "Shadrack N. Silwa", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
            Leader("MCA Sirende Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80"),
                    Leader("MCA Waitaluk Ward", "Wafula V. Didmus", "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80")

            ),
        drawable = R.drawable.splash_screen_image,
        image = "https://media.jumiadeals.com/ke_live/eee279146d60a4ce7e8af58.mobile-gallery-large.jpg"
    ),
)