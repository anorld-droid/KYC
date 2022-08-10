package com.anolddroid.kyc.ui.views.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anolddroid.kyc.model.Constituencies
import com.anolddroid.kyc.model.leaders
import com.anolddroid.kyc.ui.components.CircularImage
import com.anolddroid.kyc.ui.components.KYCScaffold
import com.anolddroid.kyc.ui.components.HomeTopBar
import com.anolddroid.kyc.ui.views.home.components.ImageText
import com.anolddroid.kyc.ui.views.home.components.PersonItem

@Composable
fun Home(navController: NavController) {
    KYCScaffold(
        topBar = {
            HomeTopBar("Tranzoia county", navController = navController)
        },
        content = {

                    Body(navController = navController)

        }
    )
}

@Composable
private fun Body(navController: NavController) {
    LazyColumn(modifier = Modifier
        .padding(horizontal = 8.dp, vertical = 12.dp)
        .fillMaxWidth()) {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                PersonItem(
                    leader = leaders[0],
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    navController = navController
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    item {
                        PersonItem(leader = leaders[1], navController = navController)
                        CircularImage(
                            imageUrl = "https://www.mdpi.com/ijerph/ijerph-16-03371/article_deploy/html/images/ijerph-16-03371-g001.png",
                            drawable = null,
                            modifier = Modifier
                                .size(240.dp),
                            elevation = 4.dp,
                            navController = navController
                        )
                        PersonItem(leader = leaders[2], navController = navController)
                    }
                }
                LazyRow(modifier = Modifier.padding(vertical = 12.dp, horizontal = 4.dp), horizontalArrangement = Arrangement.spacedBy(24.dp),
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    itemsIndexed(Constituencies) { _, constituency ->
                        Column(
                            modifier = Modifier
                                .padding(1.dp)
                                .fillMaxWidth()
                                .height(180.dp)
                        ) {
                            ImageText(style = MaterialTheme.typography.h5, navController = navController, constituency = constituency)
                        }
                    }
                }
            }
        }
    }
}


