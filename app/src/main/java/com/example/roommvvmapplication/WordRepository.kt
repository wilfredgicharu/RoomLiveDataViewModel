package com.example.roommvvmapplication

import android.os.AsyncTask
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    fun insert(word: Word){
        wordDao.insert(word)
    }

    fun deleteAll(){
        deleteAllWordsAsyncTask(wordDao).execute()
    }

    fun deleteWord(word: Word){
        deleteAllWordsAsyncTask(wordDao).execute(word)
    }

    private class deleteAllWordsAsyncTask internal constructor(private val mAsyncTaskDao: WordDao): AsyncTask<Word, Void, Void>() {
        override fun doInBackground(vararg params: Word?): Void {
            mAsyncTaskDao.deleteWord(params[0])
            return null
        }

    }
}