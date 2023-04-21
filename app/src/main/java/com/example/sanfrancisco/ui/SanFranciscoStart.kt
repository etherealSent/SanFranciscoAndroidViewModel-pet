package com.example.sanfrancisco.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sanfrancisco.R
import com.example.sanfrancisco.ui.components.DefaultButton
import com.example.sanfrancisco.ui.theme.SanFranciscoTheme

@Composable
fun SanFranciscoStartScreen(
    modifier: Modifier = Modifier,
    onclick: () -> Unit = {},
) {
    Column(
        modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(vertical = 62.dp, horizontal = 25.dp),
    ) {
        Text(
            text = stringResource(R.string.welcome),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onSurface
        )
        Spacer(modifier = Modifier.height(12.dp))
        Image(
            painter = painterResource(R.drawable.san_francisco_city_skyline_art_sticker_by_duxdesign),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(413.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        DefaultButton(onclick = { /*TODO*/ }, text = R.string.start, modifier=Modifier.width(150.dp).fillMaxWidth().align(CenterHorizontally), active = true)
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SanFranciscoStartScreenPreview() {
    SanFranciscoTheme {
        SanFranciscoStartScreen()
    }
}