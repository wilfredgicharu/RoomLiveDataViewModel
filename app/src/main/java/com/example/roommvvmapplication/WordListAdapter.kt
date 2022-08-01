package com.example.roommvvmapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class WordListAdapter internal constructor(context: Context): RecyclerView.Adapter<WordListAdapter.WordViewHolder>(){
    inner class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
       val wordItemView : TextView = itemView.findViewById(R.id.textview)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WordListAdapter.WordViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WordListAdapter.WordViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}