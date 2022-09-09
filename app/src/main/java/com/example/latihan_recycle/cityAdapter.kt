package com.example.latihan_recycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class cityAdapter(val listCity: ArrayList<ListCity>): RecyclerView.Adapter<cityAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var namaKota =view.findViewById<TextView>(R.id.txtNamaKota)
        var namaIbuKota = view.findViewById<TextView>(R.id.txtNamaIbukota)
        var imgKota = view.findViewById<ImageView>(R.id.imgCity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cityAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: cityAdapter.ViewHolder, position: Int) {
        holder.namaKota.text =listCity[position].nama
        holder.namaIbuKota.text = listCity[position].ibuKota
        holder.imgKota.setImageResource(listCity[position].img)
    }

    override fun getItemCount(): Int {
        return listCity.size
    }

}