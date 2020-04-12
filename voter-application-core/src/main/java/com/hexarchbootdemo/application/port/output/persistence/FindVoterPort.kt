package com.hexarchbootdemo.application.port.output.persistence

import com.hexarchbootdemo.application.port.input.FindVoterUseCase.FindByLastNameQuery
import com.hexarchbootdemo.domain.model.Voter
import kotlinx.coroutines.flow.Flow
import reactor.core.publisher.Flux

interface FindVoterPort {
    fun findVotersByLastName(query: FindByLastNameQuery): List<Voter>

    suspend fun findVotersByLastNameReactive(query: FindByLastNameQuery): Flow<Voter>
}
