package com.learning.daggermvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learning.daggermvvm.models.Product
import com.learning.daggermvvm.repository.ProductRepository
import com.learning.daggermvvm.utils.Constants.TAG
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: ProductRepository,
    private val randomize: Randomize
): ViewModel() {

    val productLiveData: LiveData<List<Product>>
        get() = repository.product

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}

class Randomize @Inject constructor() {
    fun doAction() {
        Log.d(TAG, "Random Action")
    }
}