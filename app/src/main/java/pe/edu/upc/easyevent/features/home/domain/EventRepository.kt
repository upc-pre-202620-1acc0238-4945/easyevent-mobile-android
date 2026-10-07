package pe.edu.upc.easyevent.features.home.domain

interface EventRepository {

    suspend fun getEvents(): Result<List<Event>>
}