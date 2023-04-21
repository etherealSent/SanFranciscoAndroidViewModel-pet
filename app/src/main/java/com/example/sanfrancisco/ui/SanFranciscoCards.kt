package com.example.sanfrancisco.ui

import android.content.res.Configuration
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.local.LocalCompaniesDataProvider
import com.example.sanfrancisco.data.local.LocalParksDataProvider
import com.example.sanfrancisco.data.model.Company
import com.example.sanfrancisco.data.model.Park
import com.example.sanfrancisco.ui.components.DefaultButton
import com.example.sanfrancisco.ui.components.TextedIcon
import com.example.sanfrancisco.ui.theme.SanFranciscoTheme

@Composable
fun SanFranciscoTopBar(
    @StringRes category: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(color = MaterialTheme.colors.surface)
            .fillMaxWidth()
            .height(59.dp)
    ) {
        Text(
            text = stringResource(category),
            modifier = Modifier.padding(start = 25.dp, top = 5.dp, bottom = 5.dp),
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onSurface
        )
    }
}

@Composable
fun parkCard(
    card: Park,
    isLiked: Boolean,
    iconOnClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(560.dp)
            .width(292.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colors.primary)
    ) {
        Column(modifier = Modifier.padding(horizontal = 21.dp, vertical = 20.dp)) {
            Text(
                text = stringResource(id = card.name),
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onPrimary
            )
            Spacer(Modifier.height(20.dp))
            Image(
                painter = painterResource(card.image),
                contentDescription = stringResource(card.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(2.dp)
                    .clip(shape = MaterialTheme.shapes.small),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextedIcon(text = R.string.square, icon = R.drawable.square)
                Spacer(Modifier.width(18.dp))
                Text(
                    text = stringResource(R.string.square_acres, card.square),
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.about),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface
            )
            Spacer(Modifier.height(6.dp))
            Text(
                text = stringResource(card.description),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
            Spacer(Modifier.weight(1f))
            IconButton(
                onClick = iconOnClick,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            ) {
                Icon(
                    painter = if (isLiked) painterResource(R.drawable.liked) else painterResource(R.drawable.notliked),
                    contentDescription = stringResource(id = R.string.like_button),
                    tint = if (isLiked) Color.Red else MaterialTheme.colors.onSurface,
                    modifier = Modifier
                        .width(34.dp)
                        .height(34.dp)
                )
            }
        }
    }
}

@Composable
fun companyCard(
    card: Company,
    isLiked: Boolean,
    onclick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .width(292.dp)
    ) {
        Column(modifier = Modifier.padding(horizontal = 21.dp, vertical = 20.dp)) {
            Text(
                text = stringResource(id = card.name),
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onSurface
            )
            Spacer(Modifier.height(20.dp))
            Image(
                painter = painterResource(card.image),
                contentDescription = stringResource(card.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(2.dp)
                    .clip(shape = MaterialTheme.shapes.small)
            )
            Spacer(Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextedIcon(text = R.string.founded, icon = R.drawable.founded)
                Spacer(Modifier.width(18.dp))
                Text(
                    text = card.founded.toString(),
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextedIcon(text = R.string.members, icon = R.drawable.members)
                Spacer(Modifier.width(18.dp))
                Text(
                    text = stringResource(R.string.workers, card.numberOfEmployees),
                    style =MaterialTheme.typography.body1
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.about),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface
            )
            Spacer(Modifier.height(6.dp))
            Text(
                text = stringResource(card.description),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
            Spacer(Modifier.height(20.dp))
            IconButton(
                onClick = onclick,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            ) {
                Icon(
                    painter = if (isLiked) painterResource(R.drawable.liked) else painterResource(R.drawable.notliked),
                    contentDescription = stringResource(id = R.string.like_button),
                    tint = if (isLiked) MaterialTheme.colors.onSurface else Color.Red
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun companyCardScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { SanFranciscoTopBar(category = R.string.companies) },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(16.dp))
            Spacer(Modifier.height(10.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun parkCardScreen(
    modifier: Modifier = Modifier,
) {
    val viewModel: parkCardScreenViewModel = viewModel()
    val uiState =viewModel.uiState.collectAsState().value

    Scaffold(
        topBar = { SanFranciscoTopBar(category = R.string.companies) },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = MaterialTheme.colors.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(16.dp))
            parkCard(
                card = uiState.currentPark,
                isLiked = uiState.isLiked,
                iconOnClick = { viewModel.updateLikeState() }
            )
            Spacer(Modifier.height(20.dp))
            Row() {
                DefaultButton(onclick = { viewModel.onBackClickedPark() }, text = R.string.back, active = viewModel.checkMoveDownButton())
                Spacer(Modifier.width(20.dp))
                DefaultButton(onclick = { viewModel.onNextClickedPark() }, text = R.string.next, active = viewModel.checkMoveUpButton())
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun parkPreview() {
    SanFranciscoTheme() {
        parkCardScreen()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun companyPreview() {
    SanFranciscoTheme {
        companyCardScreen()
    }
}