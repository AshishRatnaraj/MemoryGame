package com.example.memory.memory_feature.presentation.util

data class CardClick(val cardID: Int): MemoryEvent()
object AddPair: MemoryEvent()
object ReducedPairs: MemoryEvent()
object ChangeTheme: MemoryEvent()
object ResetGame: MemoryEvent()
