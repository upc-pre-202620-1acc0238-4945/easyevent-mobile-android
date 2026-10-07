package pe.edu.upc.easyevent.main

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable
import pe.edu.upc.easyevent.R
import pe.edu.upc.easyevent.core.designsystems.favorite
import pe.edu.upc.easyevent.core.designsystems.home

enum class NavigationItem(
    val route: @Serializable Any,
    val icon: ImageVector,
    val title: Int
) {
    HOME(
        route = HomeRoute,
        icon = home,
        title = R.string.tab_home
    ),
    FAVORITES(
        route = FavoritesRoute,
        icon = favorite,
        title = R.string.tab_favorites
    )
}