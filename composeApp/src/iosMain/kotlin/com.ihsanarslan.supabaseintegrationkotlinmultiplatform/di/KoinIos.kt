package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.di

import org.koin.dsl.module

val iosModules = module {
}

fun initKoinIOS() = initKoin(additionalModules = listOf(iosModules))