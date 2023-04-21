package com.example.sanfrancisco.ui

import com.example.sanfrancisco.data.local.LocalParksDataProvider
import com.example.sanfrancisco.data.model.Park

data class ParkCardScreenUiState(
    val parks: List<Park> = LocalParksDataProvider.getParksData(),
    val currentPark: Park = LocalParksDataProvider.defaultPark,
    val isLiked: Boolean = false
)
