package com.ihsanarslan.supabaseintegrationkotlinmultiplatform.di

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.auth.FlowType
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.logging.LogLevel
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import org.koin.dsl.module

fun supabaseModule()  = module {
    single {
        createSupabaseClient(
            supabaseUrl = "",
            supabaseKey = ""
        ) {
            defaultLogLevel = LogLevel.DEBUG
            install(Postgrest)
            install(Realtime)
        }
    }
}