package com.example.latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvView = findViewById<RecyclerView>(R.id.rv)
        rvView.layoutManager = LinearLayoutManager(this)

        val listMovie : List<Movie> = listOf(Movie(name = "fortuner", year = "2023", image = "fortuner.png"))

        rvView.adapter = MovieAdapter(listMovie)
    }
}