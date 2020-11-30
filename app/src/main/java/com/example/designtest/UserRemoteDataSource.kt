package com.example.designtest

import org.koin.dsl.module

val userModule = module {
    factory {
        UsersDetailRemoteDataSource(get())
    }
}