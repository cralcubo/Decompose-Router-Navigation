package ui

import Character
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CharacterDetailsContent(character: Character, onClickBack:() -> Unit) {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(res = character.img),
            contentDescription = character.name,
            contentScale = ContentScale.Inside,
            modifier = Modifier.height(150.dp).width(150.dp).padding(16.dp)
        )
        Text(text = character.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = character.description)
        Button(onClick = { onClickBack() }) {
            Text("Back")
        }
    }

}