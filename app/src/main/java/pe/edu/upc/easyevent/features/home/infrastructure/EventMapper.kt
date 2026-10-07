package pe.edu.upc.easyevent.features.home.infrastructure

import pe.edu.upc.easyevent.features.home.domain.Event


fun EventDto.toDomain(): Event {
    return Event(
        id = this.id,
        title = this.title,
        poster = this.poster,
        location = this.location,
        date = this.date,
        type = this.type,
        category = this.category,
        website = this.website,
        description = this.description,
        rating = this.rating,
        isFavorite = false
    )
}