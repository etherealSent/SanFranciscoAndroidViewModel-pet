package com.example.sanfrancisco.ui

import android.content.res.Configuration
import android.widget.Space
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.local.LocalCompaniesDataProvider
import com.example.sanfrancisco.data.local.LocalParksDataProvider
import com.example.sanfrancisco.ui.theme.SanFranciscoTheme
import com.example.sanfrancisco.data.model.Company
import com.example.sanfrancisco.data.model.Park
import com.example.sanfrancisco.ui.components.DefaultButton
import com.example.sanfrancisco.ui.components.TextedIcon

enum class SanFranciscoAppScreen(@StringRes val title: Int) {
    Start(R.string.welcome),
    Park(R.string.parks),
    Restaurant(R.string.restaurants),
    Liked(R.string.liked),
    Companies(R.string.companies)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen(modifier: Modifier = Modifier) {

}

