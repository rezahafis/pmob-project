package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsKuliner : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_kuliner)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Marker Kuliner Jogja
        addMarker(LatLng(-7.7746, 110.3636), "Gudeg Yu Djum")
        addMarker(LatLng(-7.7795, 110.3623), "Mie Ayam Bu Tumini")
        addMarker(LatLng(-7.7973, 110.3686), "Sate Klathak Pak Pong")
        addMarker(LatLng(-7.7853, 110.3977), "Gudeg Wijilan")
        addMarker(LatLng(-7.7884, 110.4076), "Mie Ayam Gondangdia")
        addMarker(LatLng(-7.7813, 110.3644), "Warung Handayani")
        addMarker(LatLng(-7.7822, 110.4027), "Depot Mie Setan")
        addMarker(LatLng(-7.7758, 110.3623), "Angkringan Lik Man")
        addMarker(LatLng(-7.7844, 110.3689), "Bakmi Jowo Mbah Carik")
        addMarker(LatLng(-7.7858, 110.3707), "Jejamuran Resto")
        addMarker(LatLng(-7.7805, 110.3724), "Warung Bu Ageng")
        addMarker(LatLng(-7.7921, 110.3651), "Sate Samirono")
        addMarker(LatLng(-7.7797, 110.3741), "Mie Ayam Bang Kumis")
        addMarker(LatLng(-7.7786, 110.3612), "Gudeg Pawon")
        addMarker(LatLng(-7.7965, 110.3695), "Bale Raos")
        addMarker(LatLng(-7.7979, 110.3652), "Warung Bu Broto")
        addMarker(LatLng(-7.7879, 110.3663), "Gudeg Bu Tjitro")
        addMarker(LatLng(-7.7747, 110.3605), "Bakso Pak Pele")
        addMarker(LatLng(-7.7859, 110.3615), "Sate Klathak Pak Bari")
        addMarker(LatLng(-7.7878, 110.3685), "Sop Buntut Bogor")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 12f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}