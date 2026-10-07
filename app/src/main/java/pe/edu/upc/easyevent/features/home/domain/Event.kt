package pe.edu.upc.easyevent.features.home.domain

data class Event(
    val id: Int,
    val title: String,
    val poster: String,
    val location: String,
    val date: String,
    val type: String,
    val category: String,
    val website: String,
    val description: String,
    val rating: Double,
    val isFavorite: Boolean
)
