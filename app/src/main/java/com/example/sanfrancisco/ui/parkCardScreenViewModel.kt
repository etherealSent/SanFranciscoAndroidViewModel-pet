package com.example.sanfrancisco.ui

import android.service.autofill.Validators.and
import androidx.lifecycle.ViewModel
import com.example.sanfrancisco.data.local.LocalParksDataProvider
import com.example.sanfrancisco.data.model.Company
import com.example.sanfrancisco.data.model.Park
import com.example.sanfrancisco.data.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class parkCardScreenViewModel(): ViewModel() {
    private val _uiState = MutableStateFlow(ParkCardScreenUiState())
    val uiState: StateFlow<ParkCardScreenUiState> = _uiState
    val ParkList = LocalParksDataProvider.getParksData()

    init {
        initializeUiState()
    }

    private fun initializeUiState() {
        _uiState.update {
            it.copy(
                currentPark = ParkList[0]
            )
        }
    }

    fun onNextClickedPark() {
        resetLike()
        val currentId = _uiState.value.currentPark.id
        val parkAmount = _uiState.value.parks.size
        val flag = ((currentId < parkAmount - 1) and (currentId != parkAmount))
        if (flag) {
            _uiState.update {
                it.copy(
                    currentPark =ParkList[currentId+1]
                )
            }
        } else { }
    }
    fun onBackClickedPark() {
        resetLike()
        val currentId = _uiState.value.currentPark.id
        val parkAmount = _uiState.value.parks.size
        val flag = ((currentId > 0) and (currentId <= parkAmount))
        if (flag) {
            _uiState.update {
                it.copy(
                    currentPark =ParkList[currentId-1]
                )
            }
        } else { }
    }
    fun updateLikeState() {
        val currentLikeState = _uiState.value.isLiked
        _uiState.update {
            it.copy(
                isLiked = !currentLikeState
            )
        }
    }

    fun checkMoveUpButton():Boolean {
        val currentId = _uiState.value.currentPark.id
        val parkAmount = _uiState.value.parks.size
        return (currentId == parkAmount - 1)
    }

    fun checkMoveDownButton():Boolean {
        val currentId = _uiState.value.currentPark.id
        return (currentId == 0)
    }

    fun resetLike() {
        _uiState.update {
            it.copy(
                isLiked = false
            )
        }
    }

    }

