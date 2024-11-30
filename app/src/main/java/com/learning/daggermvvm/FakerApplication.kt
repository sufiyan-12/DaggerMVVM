package com.learning.daggermvvm

import android.app.Application
import com.learning.daggermvvm.di.ApplicationComponent
import com.learning.daggermvvm.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}