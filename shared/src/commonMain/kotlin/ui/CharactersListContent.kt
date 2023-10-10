package ui

import Character
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import characters
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun CharactersListContent(onSelect: (Character) -> Unit) {
    val characters  = characters()

    LazyColumn {
        items(characters) { character ->
            CharacterCard(character){ onSelect(character) }
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CharacterCard(character: Character, onClick: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.clickable { onClick() }
    )
    {
        Image(
            painter = painterResource(res = character.img),
            contentDescription = character.name,
            contentScale = ContentScale.Inside,
            modifier = Modifier.height(150.dp).width(150.dp)
        )
        Text(character.name)
    }
}