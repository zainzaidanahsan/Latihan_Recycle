package com.example.latihan_recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listCity = arrayListOf(
            ListCity("JawaBarat", "Bandung", R.drawable.rumah_jawabarat),
            ListCity("JawaTengah", "Semarang", R.drawable.jawatengah),
            ListCity("JawaTimur", "Surabaya", R.drawable.jawatimur),
            ListCity("DIY", "Yogyakarta", R.drawable.diy),
            ListCity("Bali", "Denpasar", R.drawable.bali),
            ListCity("Banten", "Serang", R.drawable.banten),
            ListCity("DKI Jakarta", "Jakarta", R.drawable.jakarta),
            ListCity("Sumatera Barat", "Padang", R.drawable.sumbar),
            ListCity("Sumatera Utara", "Medan", R.drawable.sumut),
            ListCity("Sumatera Selatan", "Palembang", R.drawable.sumsel),
            ListCity("Riau", "Pekanbaru", R.drawable.riau)
        )
        var adapterCity = cityAdapter(listCity)
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvKota.layoutManager = lm
        rvKota.adapter = adapterCity
    }
}