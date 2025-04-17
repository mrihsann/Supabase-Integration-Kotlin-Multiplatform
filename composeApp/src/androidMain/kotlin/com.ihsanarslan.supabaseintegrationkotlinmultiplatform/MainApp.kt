package com.ihsanarslan.supabaseintegrationkotlinmultiplatform

import android.app.Application
import com.ihsanarslan.supabaseintegrationkotlinmultiplatform.di.initKoin
import org.koin.dsl.module
import org.koin.android.ext.koin.androidContext

class MainApp: Application() {

    private val androidModules = module {
    }

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        initKoin(additionalModules = listOf(androidModules)) {
            androidContext(applicationContext)
        }
    }
}