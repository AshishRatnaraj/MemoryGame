package com.example.memory.ui.theme



import androidx.compose.ui.graphics.Color
import com.example.memory.R

interface HolidayTheme {
    val backgroundPortrait: Int
    val backgroundLandscape: Int
    val cardback: Int
    val cardBaseColor: Color
    val textColor: Color
    val cardFrontBoolean: Color
    val matchedOutlineColor: Color
    val resetIconColor: Color
    val imageMap: Map<Int, Int>

    class ThanksgivingTheme(
        override val backgroundPortrait: Int = R.drawable.background_portrait_thanksgiving,
        override val backgroundLandscape: Int = R.drawable.background_landscape_thanksgiving,
        override val cardback: Int = R.drawable.cardback_thanksgiving,
        override val cardBaseColor: Color = Colors,
        override val textColor: Color = Colors.Tan,
        override val cardFrontBaseColor: Color = Colors.Brown,
        override val resetIconColor: Color = Colors.Brown,
        override val matchedOutlineColor: Color = Colors.DarkGreen,
        override val imageMap: Map<Int, Int> = mapOf(
            1 to R.drawable.tg1,
            2 to R.drawable.tg2,
            3 to R.drawable.tg3,
            4 to R.drawable.tg4,
            5 to R.drawable.tg5,
            6 to R.drawable.tg6,
            7 to R.drawable.tg7,
            8 to R.drawable.tg8,
            9 to R.drawable.tg9,
        )
    ) : HolidayTheme {
        override fun getImageResourceForNumber(number: Int): Int {
            return imageMap[number]
        }

        override fun getNextTheme(): HolidayTheme {
            return ThanksgivingTheme()

        }
    }


    class HalloweenTheme(
    override val backgroundPortrait: Int = R.drawable.background_portrait_thanksgiving,
    override val backgroundLandscape: Int = R.drawable.background_landscape_thanksgiving,
    override val cardback: Int = R.drawable.cardback_thanksgiving,
    override val cardBaseColor: Color = Colors.Tan,
    override val textColor: Color = Colors.Tan,
    override val cardFrontBaseColor: Color = Colors.Brown,
    override val matchedOutlineColor: Color = Colors.DarkGreen,
    override val resetIconColor: Color = Colors.Brown
    override val imageMap: Map<Int, Int> = mapOf(
        1 to R.drawable.hw1,
        2 to R.drawable.hw2,
        3 to R.drawable.hw3,
        4 to R.drawable.hw4,
        5 to R.drawable.hw5,
        6 to R.drawable.hw6,
        7 to R.drawable.hw7,
        8 to R.drawable.hw8,
        9 to R.drawable.hw9,
    )
    ): HolidayTheme
    {
        override fun getImageResourceForNumber(number: Int): Int {
            return imageMap[number]
        }

        override fun getNextTheme(): HolidayTheme {
            return HalloweenTheme()

        }
    }
}



