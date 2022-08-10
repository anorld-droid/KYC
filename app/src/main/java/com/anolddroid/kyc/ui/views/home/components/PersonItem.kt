package com.anolddroid.kyc.ui.views.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anolddroid.kyc.model.Leader
import com.anolddroid.kyc.ui.components.CircularImage
import com.anolddroid.kyc.ui.components.KYCSurface
import com.anolddroid.kyc.ui.theme.KYCTheme
import com.anolddroid.kyc.ui.theme.Neutral0

@Composable
fun PersonItem(
    leader: Leader,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    KYCSurface(
        shape = RoundedCornerShape(20.dp),
        modifier = modifier
            .width(220.dp)
            .height(270.dp)
            .padding(8.dp),
        elevation = 4.dp
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 4.dp, top = 8.dp, end = 4.dp, bottom = 8.dp)
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = leader.title,
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            CircularImage(
                imageUrl = leader.image,
                drawable = null,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                navController = navController
            )
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp).align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "Hon. ${leader.name}",
                        style = MaterialTheme.typography.h6,
                        color = KYCTheme.colors.textSecondary,
                        modifier = Modifier.padding(4.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}