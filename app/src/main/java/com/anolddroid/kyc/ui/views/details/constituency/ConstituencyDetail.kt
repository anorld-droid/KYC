package com.anolddroid.kyc.ui.views.details.constituency

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.ui.components.KYCScaffold
import com.anolddroid.kyc.ui.components.TopBar
import com.anolddroid.kyc.ui.views.home.components.PersonItem


@Composable
fun ConstituencyDetail(constituency: Constituency, navController: NavController) {
    KYCScaffold(
        topBar = {
            TopBar(constituency.name, navController)
        },
        content = {
            Body(navController = navController, constituency = constituency)
        }
    )
}

@Composable
private fun Body(navController: NavController, constituency: Constituency) {
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 12.dp)
            .fillMaxWidth()
    ) {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                PersonItem(
                    leader = constituency.leader,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    navController = navController
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    itemsIndexed(constituency.wards) { _, ward ->
                        PersonItem(leader = ward, navController = navController)
                    }
                }
            }
        }
    }
}