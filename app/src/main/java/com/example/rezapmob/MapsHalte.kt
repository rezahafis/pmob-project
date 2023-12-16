package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsHalte : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_kuliner)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        addMarker(LatLng(-7.8030, 110.3603), "Halte Trans Jogja Gamping (Ambarketawang)")
        addMarker(LatLng(-7.7983, 110.3642), "Halte Trans Jogja UMY 1")
        addMarker(LatLng(-7.8008, 110.3621), "Halte Trans Jogja RS PKU Muhammadiyah Gamping")
        addMarker(LatLng(-7.7971, 110.3652), "Halte Trans Jogja Malioboro 1")
        addMarker(LatLng(-7.7948, 110.3662), "Halte Trans Jogja Pasar Beringharjo")
        addMarker(LatLng(-7.7930, 110.3682), "Halte Trans Jogja Tugu Pal Putih")
        addMarker(LatLng(-7.7884, 110.3710), "Halte Trans Jogja XT Square")
        addMarker(LatLng(-7.7837, 110.3734), "Halte Trans Jogja UIN Sunan Kalijaga")
        addMarker(LatLng(-7.7927, 110.3751), "Halte Trans Jogja Terminal Giwangan")
        addMarker(LatLng(-7.7859, 110.3782), "Halte Trans Jogja Bandara Adisucipto")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 12f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}