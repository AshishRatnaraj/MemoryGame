package com.example.memory.memory_feature.presentation.memory_screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

class MemoryViewModel:ViewModel() {
  private val _state = mutableStateOf(MemoryState())
  val state: State<MemoryState> = _state
  private var delayedCompareJob: Job? = null

    fun onEvent(event: ){
        when(event){
       is MemoryEvent.Addpair

}