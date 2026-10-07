package pe.edu.upc.easyevent.features.home.infrastructure

import pe.edu.upc.easyevent.features.home.domain.Event
import pe.edu.upc.easyevent.features.home.domain.EventRepository
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(private val api: EventApi) : EventRepository {
    override suspend fun getEvents(): Result<List<Event>> {
        try {
            val response = api.getEvents()

            if (response.isSuccessful) {
                response.body()?.let { eventsDto ->
                    val events = eventsDto.map { eventDto ->
                        eventDto.toDomain()
                    }
                    return Result.success(events)
                }

            }
            return Result.failure(Exception("Error fetching events: ${response.code()}"))

        } catch (exception: Exception) {
            return Result.failure(exception)
        }
    }
}