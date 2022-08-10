package com.anolddroid.kyc.ui.views.home.components

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.ui.Destinations
import com.anolddroid.kyc.ui.components.CircularImage
import com.anolddroid.kyc.ui.theme.KYCTheme
import com.anolddroid.kyc.ui.views.home.CardShape
import com.anolddroid.kyc.ui.views.home.MinImageSize
import com.anolddroid.kyc.ui.views.home.NameProportion
import com.google.gson.Gson
import kotlin.math.max

@Composable
fun ImageText(
    modifier: Modifier = Modifier,
    gradient: List<Color> = KYCTheme.colors.gradient2_3,
    style: TextStyle = MaterialTheme.typography.subtitle1,
    navController: NavController,
    constituency: Constituency
) {
    Layout(
        modifier = modifier
            .aspectRatio(1.45f)
            .shadow(elevation = 2.dp, shape = CardShape)
            .clip(CardShape)
            .background(Brush.horizontalGradient(gradient))
            .clickable {
                val json = Uri.encode(Gson().toJson(constituency))
                navController.navigate(
                    "${Destinations.constituencyDetails}/$json"
                )
            },
        content = {
            Text(
                text = constituency.name,
                style = style,
                color = KYCTheme.colors.textSecondary,
                modifier = Modifier
                    .padding(4.dp)
                    .padding(start = 8.dp)
            )
            CircularImage(
                imageUrl = constituency.image,
                drawable = null,
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
        }
    ) { measurables, constraints ->
        // Text given a set proportion of width (which is determined by the aspect ratio)
        val textWidth = (constraints.maxWidth * NameProportion).toInt()
        val textPlaceable = measurables[0].measure(Constraints.fixedWidth(textWidth))

        // Image is sized to the larger of height of item, or a minimum value
        // i.e. may appear larger than item (but clipped to the item bounds)
        val imageSize = max(MinImageSize.roundToPx(), constraints.maxHeight)
        val imagePlaceable = measurables[1].measure(Constraints.fixed(imageSize, imageSize))
        layout(
            width = constraints.maxWidth,
            height = constraints.minHeight
        ) {
            textPlaceable.placeRelative(
                x = 0,
                y = (constraints.maxHeight - textPlaceable.height) / 2 // centered
            )
            imagePlaceable.placeRelative(
                // image is placed to end of text i.e. will overflow to the end (but be clipped)
                x = textWidth,
                y = (constraints.maxHeight - imagePlaceable.height) / 2 // centered
            )
        }
    }
}


