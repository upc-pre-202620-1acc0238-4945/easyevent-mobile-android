package pe.edu.upc.easyevent.features.home.application

import pe.edu.upc.easyevent.features.home.domain.Event
import pe.edu.upc.easyevent.features.home.domain.EventRepository
import javax.inject.Inject

class GetEventsUseCase @Inject constructor(private val repository: EventRepository) {

    suspend operator fun invoke(): Result<List<Event>> {
        return repository.getEvents()
    }
}
