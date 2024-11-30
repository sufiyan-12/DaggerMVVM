package com.learning.daggermvvm.di

import androidx.lifecycle.ViewModel
import com.learning.daggermvvm.viewmodel.MainViewModel
import com.learning.daggermvvm.viewmodel.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun provideMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun provideMainViewModel2(mainViewModel2: MainViewModel2): ViewModel

}