package com.learning.daggermvvm.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product_Table")
data class Product(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val category: String,
    val description: String,
    val image: String,
    val price: Double,
    val title: String
)