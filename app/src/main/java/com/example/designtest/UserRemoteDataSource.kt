package com.example.designtest

import org.koin.dsl.module

val userDetailRemoteModule = module {
    factory {
        UsersDetailRemoteDataSource(get())
    }
}