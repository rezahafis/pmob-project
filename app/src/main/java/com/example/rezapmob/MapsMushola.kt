package com.example.rezapmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsMushola : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_kuliner)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Marker Mushola Jogja
        addMarker(LatLng(-7.832401919333312, 110.38252944496939), "Masjid Islamic Center UAD")
        addMarker(LatLng(-7.82280390786399, 110.36423805115477), "Masjid Jogokariyan")
        addMarker(LatLng(-7.822116357143397, 110.37882389414169), "Masjid Al-Azka Sorosutan")
        addMarker(LatLng(-7.820471781254749, 110.35630538275673), "Masjid Baabul Firdaus")
        addMarker(LatLng(-7.807867627436646, 110.3562527469946), "Masjid Ash-Shiddiq")
        addMarker(LatLng(-7.807466618291031, 110.40654814756334), "Masjid Al-Ittihaad Ketandan Raya Banguntapan")
        addMarker(LatLng(-7.7713920889433545, 110.37966689968437), "Masjid Kampus UGM")
        addMarker(LatLng(-7.784930807762917, 110.36940630967392), "Masjid Syuhada")
        addMarker(LatLng(-7.79976699254644, 110.37585421381402), "Kagungan Dalem Masjid Ageng Pakualaman")
        addMarker(LatLng(-7.802412702730383, 110.36298762430728), "Masjid Gedhe Kauman")

        // Pusatkan kamera pada Jogja
        val jogja = LatLng(-7.7956, 110.3695)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jogja, 12f))
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }
}