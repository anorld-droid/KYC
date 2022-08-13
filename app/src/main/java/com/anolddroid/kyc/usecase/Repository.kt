package com.anolddroid.kyc.usecase

import com.anolddroid.kyc.model.Constituency
import com.anolddroid.kyc.model.Leader
import com.anolddroid.kyc.model.listOfConstituencies
import com.anolddroid.kyc.model.listOfLeaders
import javax.inject.Inject

interface Repository {
    fun getConstituencies() : List<Constituency>
    fun governor(): Leader
    fun deputyGovernor(): Leader
    fun senator() : Leader
}


class RepositoryImpl  @Inject constructor(): Repository{
    override fun getConstituencies() = listOfConstituencies

    override fun governor() = listOfLeaders[0]

    override fun deputyGovernor() = listOfLeaders[1]

    override fun senator() = listOfLeaders[2]

}