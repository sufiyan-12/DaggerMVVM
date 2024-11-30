package com.learning.daggermvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.learning.daggermvvm.db.FakerDB
import com.learning.daggermvvm.models.Product
import com.learning.daggermvvm.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB){

    private val _products = MutableLiveData<List<Product>>()
    val product: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if(result.isSuccessful && result.body() != null){
            val body: List<Product> = result.body()!!
            fakerDB.getFakerDAO().addProducts(body)
            _products.postValue(result.body())
        }
    }
}