package com.example.sanfrancisco.ui.components

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sanfrancisco.R

@Composable
fun TextedIcon(
    @StringRes text: Int,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = stringResource(id = text),
            tint = MaterialTheme.colors.secondary
        )
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.onSurface
        )
    }
}

@Composable
fun DefaultButton(
    onclick: () -> Unit,
   @StringRes text: Int,
    active: Boolean,
    modifier: Modifier = Modifier
) {
    val buttonColor = if (active) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.onSurface
    val textColor = if (active) MaterialTheme.colors.onSurface else MaterialTheme.colors.secondaryVariant
    Button(
        onClick = onclick,
        modifier = modifier
            .width(150.dp)
            .height(40.dp),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor)
    ) {
        Text(text = stringResource(text), textAlign = TextAlign.Center, color = textColor)
    }
}


@Preview("DarkTheme",uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TextedIconPreview() {
    TextedIcon(text = R.string.founded, icon = R.drawable.founded)
}