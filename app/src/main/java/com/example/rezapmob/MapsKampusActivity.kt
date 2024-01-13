package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsKampusActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_kuliner)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Marker Kampus Jogja
        addMarker(LatLng(-7.832958545245657, 110.38303536346835), "Kampus 4 UAD")
        addMarker(LatLng(-7.797893786013417, 110.3832069745159), "Kampus 1 UAD")
        addMarker(LatLng(-7.820212256369305, 110.38781392298962), "Kampus 2 UAD")
        addMarker(LatLng(-7.808448392199941, 110.38969994970384), "Kampus 3 UAD")
        addMarker(LatLng(-7.825770072878124, 110.3799541646381), "Kampus 5 UAD")
        addMarker(LatLng(-7.771068572693652, 110.37752837684388), "Universitas Gadjah Mada")
        addMarker(LatLng(-7.773418427933866, 110.38616609951474), "Universitas Negeri Yogyakarta")
        addMarker(LatLng(-7.775270518510702, 110.38983749415306), "Universitas Sanata Dharma")
        addMarker(LatLng(-7.81070688894187, 110.3219952324958), "Universitas Muhammadiyah Yogyakarta")
        addMarker(LatLng(-7.7860116394224805, 110.37874176781361), "Universitas Kristen Duta Wacana")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 12f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}