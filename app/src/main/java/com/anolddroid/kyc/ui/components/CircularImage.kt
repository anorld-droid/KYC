package com.anolddroid.kyc.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.anolddroid.kyc.ui.theme.KYCTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.anolddroid.kyc.R
import com.anolddroid.kyc.ui.Destinations
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CircularImage(
    imageUrl: String?,
    drawable: Int?,
    modifier: Modifier,
    elevation: Dp = 0.dp,
    navController: NavController

) {
    KYCSurface(
        color = Color.LightGray,
        shape = CircleShape,
        modifier = modifier
            .padding(4.dp)
            .size(90.dp),
        elevation = elevation
    ) {
        Image(
            painter = if (imageUrl.isNullOrEmpty()) {
                if (drawable != null) {
                    painterResource(id = drawable)
                }else{
                    painterResource(id = R.drawable.ic_launcher_background)
                }
            } else {
                rememberImagePainter(
                    data = imageUrl,
                    builder = {
                        crossfade(true)
                    }
                )
            },
            modifier = Modifier
                .clickable(onClick = {
                    val url = URLEncoder.encode(imageUrl, StandardCharsets.UTF_8.toString())
                    navController.navigate("${Destinations.showImage}/$url")
                })
                .fillMaxSize()
                .background(
                    color = KYCTheme.colors.iconInteractiveInactive,
                    shape = CircleShape
                ),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
        )

    }
}
