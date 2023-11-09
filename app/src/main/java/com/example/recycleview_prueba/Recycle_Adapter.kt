package com.example.recycleview_prueba

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Recycle_Adapter (private val mFilms: List<Films>) : RecyclerView.Adapter<Recycle_Adapter.ViewHolder?>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleFilm: TextView = itemView.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.recycle_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return mFilms.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val films: Films = mFilms.get(position)

        val textView = holder.titleFilm
        textView.text = films.filmName

    }

}