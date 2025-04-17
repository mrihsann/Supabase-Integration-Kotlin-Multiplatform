package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.di

import com.ihsanarslan.supabaseintegrationkotlinmultiplatform.presentation.home.HomeViewModel
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.auth.FlowType
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.logging.LogLevel
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

fun viewModelModule()  = module {
    factoryOf(::HomeViewModel)
}