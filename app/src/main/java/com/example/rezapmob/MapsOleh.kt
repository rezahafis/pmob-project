package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsOleh : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_kuliner)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Marker Oleh Oleh Jogja
        addMarker(LatLng(-7.8070, 110.3634), "Malioboro (Berbagai Oleh-Oleh)")
        addMarker(LatLng(-7.7950, 110.3664), "Pasar Beringharjo (Makanan, Batik, Perhiasan)")
        addMarker(LatLng(-7.7801, 110.4098), "Desa Wisata Kasongan (Gerabah & Keramik)")
        addMarker(LatLng(-7.7947, 110.3692), "Bakpia Pathuk 25 (Bakpia Jogja Terbaik)")
        addMarker(LatLng(-7.8027, 110.3634), "Cokelat Monggo (Cokelat Khas Jogja)")
        addMarker(LatLng(-7.7945, 110.3694), "Dagadu Djokdja (Souvenir Unik & Kreatif)")
        addMarker(LatLng(-7.7902, 110.3666), "Hamzah Batik (Batik Tulis & Cap)")
        addMarker(LatLng(-7.7941, 110.3677), "Pusat Oleh-Oleh Terlengkap (Berbagai Macam)")
        addMarker(LatLng(-7.7975, 110.3678), "Toko Oleh-oleh Khas Jogja BU TINI (Makanan & Camilan)")
        addMarker(LatLng(-7.7932, 110.3691), "Oleh-Oleh Kaos Khas Jogja (Kaos & Souvenir)")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 12f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}