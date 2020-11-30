package com.example.designtest

import com.apollographql.apollo.ApolloClient
import org.koin.dsl.module

val networkModule = module {
    single { provideApolloClient()}
}

fun provideApolloClient():ApolloClient {
    return ApolloClient.builder().serverUrl(AppConstants.baseUrl).build()
}
