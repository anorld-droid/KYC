package com.anolddroid.kyc.domain

import com.anolddroid.kyc.usecase.Repository
import com.anolddroid.kyc.usecase.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@InstallIn(ViewModelComponent::class)
@Module
abstract class AppModule {
    @Binds
    abstract fun provideRepository(repo: RepositoryImpl): Repository
}