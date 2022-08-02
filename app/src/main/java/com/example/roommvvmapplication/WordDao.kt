package com.example.roommvvmapplication

import androidx.lifecycle.LiveData
import androidx.room.*

//Dao
@Dao
interface WordDao {
    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

    @Update
    fun update(word: Word)

    @Query("UPDATE word_table SET word = :word WHERE id== :id")
    fun updateItem(word: String, id: Int)

    @Delete
    fun deleteWord(word: Word)
}