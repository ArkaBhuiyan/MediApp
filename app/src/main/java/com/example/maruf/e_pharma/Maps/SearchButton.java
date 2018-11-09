package com.example.maruf.e_pharma.Maps;

import android.location.Address;
import android.location.Geocoder;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

public class SearchButton implements ButtonInterface{

    public void ButtonFunction() {
        EditText tf_location = findViewById(R.id.TF_location);
        String location = tf_location.getText().toString();
        List<Address> addressList;
        if (!location.equals("")) {
            Geocoder geocoder = new Geocoder(this);

            try {
                addressList = geocoder.getFromLocationName(location, 5);

                if (addressList != null) {
                    for (int i = 0; i < addressList.size(); i++) {
                        LatLng latLng = new LatLng(addressList.get(i).getLatitude(), addressList.get(i).getLongitude());
                        MarkerOptions markerOptions = new MarkerOptions();
                        markerOptions.position(latLng);
                        markerOptions.title(location);
                        mMap.addMarker(markerOptions);
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
