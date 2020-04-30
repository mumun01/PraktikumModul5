package com.maps.praktikummodul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsTempatMakan extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Druju = new LatLng(-8.2384035, 112.6798176);
        mMap.addMarker(new MarkerOptions().position(Druju).title("Rumah Saya").snippet("Jawa Timur"));

        LatLng WarungBakso = new LatLng(-8.239745,112.6820162);
        mMap.addMarker(new MarkerOptions().position(WarungBakso).title("Warung Bakso Minthend Yoo Minthend Druju Malang").snippet("Jawa Timur"));

        LatLng WarungBakso1 = new LatLng(-8.235989,112.68308);
        mMap.addMarker(new MarkerOptions().position(WarungBakso1).title("BAKSO (PAK SUTIYAR)").snippet("Jawa Timur"));

        LatLng WarungBakso2 = new LatLng(-8.2429445,112.6824837);
        mMap.addMarker(new MarkerOptions().position(WarungBakso2).title("Bakso & Cilok Anugrah Lonceng").snippet("Jawa Timur"));

        LatLng Warung = new LatLng(-8.2439882,112.6820897);
        mMap.addMarker(new MarkerOptions().position(Warung).title("Warung Lumayan").snippet("Jawa Timur"));

        LatLng Warung1 = new LatLng(-8.2440357,112.6818776);
        mMap.addMarker(new MarkerOptions().position(Warung1).title("Mie Ayam Ceker & Bakso Sapi").snippet("Jawa Timur"));

        LatLng Warung2 = new LatLng(-8.2443683,112.6823892);
        mMap.addMarker(new MarkerOptions().position(Warung2).title("Depot Hidayah").snippet("Jawa Timur"));

        LatLng Warung3 = new LatLng(-8.2455604,112.6817597);
        mMap.addMarker(new MarkerOptions().position(Warung3).title("Lumintu Warung Nasi Empok Druju Sumawe").snippet("Jawa Timur"));

        LatLng Warung4 = new LatLng(-8.2457649,112.6818086);
        mMap.addMarker(new MarkerOptions().position(Warung4).title("Warung Pecel Nduk Chua/ Erwin Smw").snippet("Jawa Timur"));

        LatLng Warung5 = new LatLng(-8.2459654,112.6814093);
        mMap.addMarker(new MarkerOptions().position(Warung5).title("Bakso Daging Sapi Dan Mie Ayam (Bu Nanik)").snippet("Jawa Timur"));

        LatLng Warung6 = new LatLng(-8.2462562,112.6810126);
        mMap.addMarker(new MarkerOptions().position(Warung6).title("Warung Al-Hikmah").snippet("Jawa Timur"));

        LatLng Warung7 = new LatLng(-8.2465103,112.6805053);
        mMap.addMarker(new MarkerOptions().position(Warung7).title("Luminu Warung Nasi Empog").snippet("Jawa Timur"));

        LatLng Warung8 = new LatLng(-8.2469149,112.6804885);
        mMap.addMarker(new MarkerOptions().position(Warung8).title("Warung Rujak Cingur Druju").snippet("Jawa Timur"));

        LatLng Warung9 = new LatLng(-8.2481083,112.6795553);
        mMap.addMarker(new MarkerOptions().position(Warung9).title("Warung Nasi Barokah Bu Sulani").snippet("Jawa Timur"));

        LatLng Warung10 = new LatLng(-8.2481083,112.6795553);
        mMap.addMarker(new MarkerOptions().position(Warung10).title("Martabak Dan Terang Bulan").snippet("Jawa Timur"));


        LatLng CafeRaja = new LatLng(-8.2355127,112.682706);
        mMap.addMarker(new MarkerOptions().position(CafeRaja).title("Cafe Raja").snippet("Jawa Timur"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Druju, 15));

    }
}
