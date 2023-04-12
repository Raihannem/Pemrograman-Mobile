package com.example.latihan1

import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class MovieAdapter(val data: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val imgView = row.findViewById<ImageView>(R.id.imgView)
        val tvNama = row.findViewById<TextView>(R.id.tvNama)
        val tvYear = row.findViewById<TextView>(R.id.tvYear)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item,
            parent, false)
        return MyViewHolder(layout)

    }
    override fun onBindViewHolder(holder: MovieAdapter.MyViewHolder, position: Int) {
        holder.imgView.setImageResource(R.drawable.fortuner)
        holder.tvNama.text = data.get(position).toString()
        holder.tvYear.text = "2023"

//        holder.row.setOnClickListener {v ->
//            val toast = Toast.makeText(v.context, data.get(position).toString(),Toast.LENGTH_LONG)
//            toast.show()
//
//            val intent = Intent(v.context, DetailMovie Activity::class.java)v.context
//        }
    }
    override fun getItemCount(): Int = data.size

}