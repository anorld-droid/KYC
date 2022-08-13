package com.anolddroid.kyc.viewmodel

import androidx.lifecycle.ViewModel
import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.model.Leader
import com.anolddroid.kyc.usecase.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: Repository
): ViewModel() {
    private val _constituencies =  MutableStateFlow(repo.getConstituencies())
    val constituencies: StateFlow<List<Constituency>>
    get() = _constituencies

    private val _governor =  MutableStateFlow(repo.governor())
    val governor : StateFlow<Leader>
        get() = _governor

    private val _deputyGovernor =  MutableStateFlow(repo.deputyGovernor())
    val deputyGovernor : StateFlow<Leader>
        get() = _deputyGovernor

    private val _senator =  MutableStateFlow(repo.senator())
    val senator : StateFlow<Leader>
        get() = _senator

}