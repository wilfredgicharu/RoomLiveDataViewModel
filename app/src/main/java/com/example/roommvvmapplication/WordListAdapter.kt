package com.example.roommvvmapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class WordListAdapter internal constructor(context: Context): RecyclerView.Adapter<WordListAdapter.WordViewHolder>(){

    private var words = emptyList<Word>()
    inner class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
       val wordItemView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WordListAdapter.WordViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_word, parent, false)
        return WordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WordListAdapter.WordViewHolder, position: Int) {
        val current = words[position]
        holder.wordItemView.text = current.word
    }

    override fun getItemCount(): Int {
        return words.size
    }

    internal fun setWords(words: List<Word>){
        this.words = words
        notifyDataSetChanged()
    }

    fun getWordAtPosition(position: Int): Word {
        return words[position]
    }

}