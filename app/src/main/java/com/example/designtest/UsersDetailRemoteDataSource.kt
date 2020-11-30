package com.example.designtest

import android.util.Log
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException

class UsersDetailRemoteDataSource(private val apolloClient: ApolloClient) {
    private val TAG = "UsersDetailRemoteDataSo"

    fun getUserDetail() {
        apolloClient.query(UserDetailQuery.builder().build()).enqueue(object :
            ApolloCall.Callback<UserDetailQuery.Data>() {
            override fun onResponse(response: Response<UserDetailQuery.Data>) {
                Log.d(TAG, "onResponse: ${response.data()?.users?.data?.get(0)}")
            }

            override fun onFailure(e: ApolloException) {
                Log.d(TAG, "onFailure: $e")
            }
        })
    }

    fun getUserName() {
        apolloClient.query(UserNameQuery.builder().build()).enqueue(object :
            ApolloCall.Callback<UserNameQuery.Data>() {
            override fun onResponse(response: Response<UserNameQuery.Data>) {
                Log.d(TAG, "onResponse: ${response.data()}")
            }

            override fun onFailure(e: ApolloException) {
                Log.d(TAG, "onFailure: $e")
            }
        })
    }
}