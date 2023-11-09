package com.example.recycleview_prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycle = findViewById<RecyclerView>(R.id.recycle_lay)

        val films : ArrayList<Films> = ArrayList<Films>()
        var numFilms: Int = 0

        for (i in 1..15){ // IGUAL QUE INT (i=1 i<numContact i++)

            films.add(Films("film_" + ++numFilms, null))
        }

        recycle.adapter = Recycle_Adapter(films)
        recycle.layoutManager = GridLayoutManager(this, 3)
    }

}