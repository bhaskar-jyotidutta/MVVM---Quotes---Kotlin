package com.bhaskar.mvvmquotes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quote")
    fun getQuote(): LiveData<List<Quote>>

    suspend fun insertQuote(quote: Quote)

}