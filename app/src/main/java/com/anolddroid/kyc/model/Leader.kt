package com.anolddroid.kyc.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Leader(
    val title: String,
    val name: String,
    val image: String,
): Parcelable

val leaders = listOf<Leader>(
    Leader(
        title = "Governor",
        name = "Julius Scot Nyerere",
        image = "https://images.unsplash.com/photo-1615813967515-e1838c1c5116?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80",
    ),
    Leader(
        title = "Deputy Governor",
        name = "Ombita S. Wakhungu",
        image = "https://images.unsplash.com/photo-1519085360753-af0119f7cbe7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
    ),
    Leader(
        title = "Senator",
        name = "K. Mary Mukhwana",
        image = "https://images.unsplash.com/photo-1531123897727-8f129e1688ce?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
    )

)