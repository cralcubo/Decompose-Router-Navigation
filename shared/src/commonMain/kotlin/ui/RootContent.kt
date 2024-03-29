package ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import io.github.xxfast.decompose.router.Router
import io.github.xxfast.decompose.router.content.RoutedContent
import io.github.xxfast.decompose.router.rememberRouter
import ui.Screen.CharacterDetails

@Composable
fun RootContent() {
    val router: Router<Screen> = rememberRouter(type = Screen::class) { listOf(Screen.CharactersList) }

    RoutedContent(
        router = router,
        animation = stackAnimation(slide())
    ) {
        when(it) {
            is CharacterDetails -> CharacterDetailsContent(it.character, router::pop)
            is Screen.CharactersList -> CharactersListContent { ch -> router.push(CharacterDetails(ch)) }
        }

    }
}

