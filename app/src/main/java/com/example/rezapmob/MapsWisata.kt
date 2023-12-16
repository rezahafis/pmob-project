package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsWisata : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_wisata)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Tambahkan marker untuk 10 tempat wisata di Jogja
        addMarker(LatLng(-7.7956, 110.3695), "Tugu Yogyakarta")
        addMarker(LatLng(-7.7755, 110.3749), "Malioboro Street")
        addMarker(LatLng(-7.7548, 110.4316), "Prambanan Temple")
        addMarker(LatLng(-7.7828, 110.3607), "Keraton Yogyakarta")
        addMarker(LatLng(-7.7914, 110.3660), "Vredeburg Fortress")
        addMarker(LatLng(-7.8331, 110.3978), "Borobudur Temple")
        addMarker(LatLng(-7.8323, 110.3610), "Ullen Sentalu Museum")
        addMarker(LatLng(-7.5938, 110.2250), "Kaliurang Park")
        addMarker(LatLng(-7.7118, 110.2888), "Parangtritis Beach")
        addMarker(LatLng(-7.5613, 110.8226), "Pine Forest Imogiri")
        addMarker(LatLng(-7.7805, 110.3874), "Tamansari Water Castle")
        addMarker(LatLng(-7.7910, 110.3649), "Affandi Museum")
        addMarker(LatLng(-7.7896, 110.3631), "Sonobudoyo Museum")
        addMarker(LatLng(-7.7540, 110.4941), "Ratu Boko Temple")
        addMarker(LatLng(-7.7655, 110.4175), "Jogja City Mall")
        addMarker(LatLng(-7.8114, 110.3630), "Gembira Loka Zoo")
        addMarker(LatLng(-7.7826, 110.4239), "Museum Benteng Vredeburg")
        addMarker(LatLng(-7.7735, 110.4946), "De Mata Trick Eye Museum")
        addMarker(LatLng(-7.7116, 110.3953), "Plaosan Temple")
        addMarker(LatLng(-7.8092, 110.3545), "Taman Pintar Yogyakarta")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 10f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}
