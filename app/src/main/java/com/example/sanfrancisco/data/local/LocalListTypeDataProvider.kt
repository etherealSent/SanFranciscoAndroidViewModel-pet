package com.example.sanfrancisco.data.local

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.model.ListType
import com.example.sanfrancisco.data.model.NavigationItemContent

object LocalListTypeDataProvider {

    fun getLocalListTypeData(): List<NavigationItemContent>{
        return listOf(
            NavigationItemContent(
                listType = ListType.Restaurant,
                icon = Icons.Default.List,
                text = R.string.restaurants
            ),
            NavigationItemContent(
                listType = ListType.Park,
                icon = Icons.Default.List,
                text = R.string.parks
            ),
            NavigationItemContent(
                listType = ListType.Company,
                icon = Icons.Default.List,
                text = R.string.company
            ),
            NavigationItemContent(
                listType = ListType.Liked,
                icon = Icons.Default.List,
                text = R.string.liked
            )
        )
    }
}