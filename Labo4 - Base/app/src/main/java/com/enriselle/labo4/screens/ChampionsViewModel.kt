package com.enriselle.labo4.screens

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enriselle.labo4.utils.ChampionDummyData
import com.enriselle.labo4.utils.ChampionInformation
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ChampionsViewModel: ViewModel() {
    private val _listChampions = MutableStateFlow<List<ChampionInformation>>(emptyList())
    val listChampions = _listChampions.asStateFlow()
    private val _selectedChampion = MutableStateFlow(ChampionInformation())
    val selectedChampion = _selectedChampion.asStateFlow()
    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

//asignar el valor del dummydata
    fun fetchData() {
        _listChampions.value = ChampionDummyData
    }

    fun saveDataFromSelectedChampion(champSelected: ChampionInformation) {
        _selectedChampion.value = champSelected
    }
}