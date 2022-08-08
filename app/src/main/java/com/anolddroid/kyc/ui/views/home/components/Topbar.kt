package com.anolddroid.kyc.ui.views.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.anolddroid.kyc.ui.theme.KYCTheme
import com.google.accompanist.insets.statusBarsPadding

@Composable
fun HomeTopBar(
) {
    Column(
        modifier = Modifier.statusBarsPadding()
    ) {
        TopAppBar(
            backgroundColor = KYCTheme.colors.uiBackground,
            contentColor = KYCTheme.colors.textSecondary,
            elevation = 5.dp, // No shadow needed
            title = {
                Text(
                    text = "Tranzoia county",
                    style = MaterialTheme.typography.h5,
                    color = KYCTheme.colors.textSecondary,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                )
            },
            )
        Divider()
    }
}