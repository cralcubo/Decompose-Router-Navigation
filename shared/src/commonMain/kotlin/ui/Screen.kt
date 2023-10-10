package ui

import Character
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

@Parcelize
sealed class Screen : Parcelable {
    data object CharactersList : Screen()
    data class CharacterDetails(val character: Character) : Screen()
}