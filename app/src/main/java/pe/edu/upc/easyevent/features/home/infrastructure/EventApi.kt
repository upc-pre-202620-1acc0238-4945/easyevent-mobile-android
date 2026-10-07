package pe.edu.upc.easyevent.features.home.infrastructure

import retrofit2.Response
import retrofit2.http.GET

interface EventApi {

    @GET("events")
    suspend fun getEvents(): Response<List<EventDto>>
}