package pe.edu.upc.easyevent.features.home.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import pe.edu.upc.easyevent.features.home.domain.Event

@Composable
fun EventList(events: List<Event>) {
    LazyColumn {
        items(events) { event ->
            EventCard(event)
        }
    }
}