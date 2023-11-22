package com.example.memory.memory_feature.presentation.memory_screen

data class MemoryState(
    val cards: Array<MemoryCard> = generateCardsArray(6),
    val card1: Int? = null,
    val card2: Int? = null,
    val pairCounts: Int = 6,
    val clickCount: Int = 0,
    val currentTheme: HolidayTheme = ThanksgivingTheme()
)

