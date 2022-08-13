package com.anolddroid.kyc.ui.views.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anolddroid.kyc.R
import com.anolddroid.kyc.ui.theme.KYCTheme
import com.google.accompanist.insets.statusBarsPadding

@Composable
fun HomeTopBar(title: String,
) {
    Column(
        modifier = Modifier.statusBarsPadding()
    ) {
        TopAppBar(
            backgroundColor = KYCTheme.colors.uiBackground,
            contentColor = KYCTheme.colors.textSecondary,
            elevation = 5.dp, // No shadow needed
            title = {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                    Text(
                        text = title,
                        style = MaterialTheme.typography.h5,
                        color = KYCTheme.colors.textSecondary,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .padding(0.dp)
                            .weight(1f)
                    )
                }
            }
        )
        Divider()
    }
}