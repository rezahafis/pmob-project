package com.example.rezapmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myOlehView: ImageView = findViewById(R.id.image_Oleh)
        val myWisataView: ImageView = findViewById(R.id.image_Wisata)
        val myKulinerView: ImageView = findViewById(R.id.image_Kuliner)
        val myHalteView: ImageView = findViewById(R.id.image_halte)
        val myMusholaView: ImageView = findViewById(R.id.image_Mushola)
        val myKampusView: ImageView = findViewById(R.id.image_Campus)

        myWisataView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Pindah ke Maps Wisata
                startActivity(Intent(this@MainActivity, MapsWisata::class.java))
            }
        })

        myKulinerView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //Pindah ke Maps Kuliner
                startActivity(Intent(this@MainActivity, MapsKuliner::class.java))
            }
        })

        myHalteView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //Pindah ke Maps Halte
                startActivity(Intent(this@MainActivity, MapsHalte::class.java))
            }
        })

        myOlehView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //Pindah ke Maps Oleh Oleh
                startActivity(Intent(this@MainActivity, MapsOleh::class.java))
            }
        })

        myMusholaView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //Pindah ke Maps Mushola
                startActivity(Intent(this@MainActivity, MapsMushola::class.java))
            }
        })


        myKampusView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //Pindah ke Maps Kampus
                startActivity(Intent(this@MainActivity, MapsKampusActivity::class.java))
            }
        })
    }
}