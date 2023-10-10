import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import io.github.xxfast.decompose.router.LocalRouterContext
import io.github.xxfast.decompose.router.RouterContext
import ui.RootContent

@Composable
fun App() {
    val lifecycle = LifecycleRegistry()
    val rootRouterContext = RouterContext(lifecycle = lifecycle)
    MaterialTheme {
        CompositionLocalProvider(LocalRouterContext provides rootRouterContext) {
            RootContent()
        }
    }
}
