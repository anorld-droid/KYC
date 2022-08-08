package com.anolddroid.kyc.ui.views.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.anolddroid.kyc.R
import com.google.accompanist.insets.statusBarsPadding

@OptIn(ExperimentalCoilApi::class)
@Composable
fun showImage(imageUrl: String, navController: NavController){
    Column(modifier = Modifier.fillMaxSize().padding(top = 5.dp).statusBarsPadding()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = stringResource(id = R.string.arrow_back))
            }
        }
        Image(
            painter = rememberImagePainter(
            data = imageUrl,
            builder = {
                crossfade(true)
            }),
            modifier  = Modifier.fillMaxSize(),
            contentDescription = stringResource(id = R.string.image),
            contentScale = ContentScale.Fit
        )

    }
}