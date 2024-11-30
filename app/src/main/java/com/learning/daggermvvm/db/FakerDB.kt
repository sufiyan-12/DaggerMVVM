package com.learning.daggermvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.learning.daggermvvm.models.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class FakerDB : RoomDatabase() {

    abstract fun getFakerDAO(): FakerDAO
}