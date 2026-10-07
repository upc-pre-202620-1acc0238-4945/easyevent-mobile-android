package pe.edu.upc.easyevent.features.home.presentation

import pe.edu.upc.easyevent.features.home.domain.Event

data class HomeUiState(
    val events: List<Event> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)