package com.anolddroid.kyc.usecase

import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.model.Leader
import com.anolddroid.kyc.model.listOfConstituencies
import com.anolddroid.kyc.model.listOfLeaders
import javax.inject.Inject

interface Repository {
    fun getConstituencies() : List<Constituency>
    fun getLeaders() : List<Leader>
}


class RepositoryImpl  @Inject constructor(): Repository{
    override fun getConstituencies() = listOfConstituencies

    override fun getLeaders() = listOfLeaders

}