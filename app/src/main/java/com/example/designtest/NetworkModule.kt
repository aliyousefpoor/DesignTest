package com.example.designtest

import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import org.koin.dsl.module

val networkModule = module {
    single { provideApolloClient()}
}

fun provideApolloClient():ApolloClient {
    val apolloClient = ApolloClient.builder().serverUrl("https://graphqlzero.almansi.me/api").build()
    return apolloClient
}