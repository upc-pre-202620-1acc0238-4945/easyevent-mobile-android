package pe.edu.upc.easyevent.features.home.infrastructure

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easyevent.features.home.domain.EventRepository

@Module
@InstallIn(SingletonComponent::class)
interface HomeRepositoryModule {

    @Binds
    fun provideEventRepository(impl: EventRepositoryImpl): EventRepository
}