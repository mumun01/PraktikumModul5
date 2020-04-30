package com.maps.praktikummodul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsSekolah extends FragmentActivity implements OnMapReadyCallback {

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

        // SMK
        LatLng SMK_DarulHIkmah = new LatLng(-8.2442116, 112.6518965);
        mMap.addMarker(new MarkerOptions().position(SMK_DarulHIkmah).title("SMK Darul Hikmah SumbermanjingWetan").snippet("Jawa Timur"));

        LatLng SMK_PGRI_GEdangan = new LatLng(-8.2442116, 112.6518965);
        mMap.addMarker(new MarkerOptions().position(SMK_PGRI_GEdangan).title("SMK PGRI Gedangan").snippet("Jawa Timur"));

        // SMP
        LatLng SMP_Islam = new LatLng(-8.2456009, 112.6817647);
        mMap.addMarker(new MarkerOptions().position(SMP_Islam).title("SMP Islam Druju").snippet("Jawa Timur"));

        // SD
        LatLng MIN_Druju = new LatLng(-8.2449712, 112.6796871);
        mMap.addMarker(new MarkerOptions().position(MIN_Druju).title("Min Druju").snippet("Jawa Timur"));
        LatLng SDN_Druju04 = new LatLng(-8.2449712, 112.6796871);
        mMap.addMarker(new MarkerOptions().position(SDN_Druju04).title("SDN Druju 04").snippet("Jawa Timur"));
        LatLng SDNegeri_Druju02 = new LatLng(-8.2453832, 112.663902);
        mMap.addMarker(new MarkerOptions().position(SDNegeri_Druju02).title("SD Negeri Druju 02").snippet("Jawa Timur"));
        LatLng SDN_Druju03 = new LatLng(-8.2573358, 112.6577114);
        mMap.addMarker(new MarkerOptions().position(SDN_Druju03).title("SDN Druju 03").snippet("Jawa Timur"));
        LatLng SDN_Segaran04 = new LatLng(-8.2464551, 112.6455851);
        mMap.addMarker(new MarkerOptions().position(SDN_Segaran04).title("SDN Segaran 04").snippet("Jawa Timur"));
        LatLng SDN_Segaran01 = new LatLng(-8.2464551, 112.6455851);
        mMap.addMarker(new MarkerOptions().position(SDN_Segaran01).title("SDN Segaran 01").snippet("Jawa Timur"));
        LatLng SDNegeri_02Segaran = new LatLng(-8.2533836, 112.6482556);
        mMap.addMarker(new MarkerOptions().position(SDNegeri_02Segaran).title("SD Negeri 2 Segaran").snippet("Jawa Timur"));
        LatLng SDN_Segaran05 = new LatLng(-8.2557407, 112.6495547);
        mMap.addMarker(new MarkerOptions().position(SDN_Segaran05).title("SDN Segaran 05").snippet("Jawa Timur"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Druju, 13));

    }
}
