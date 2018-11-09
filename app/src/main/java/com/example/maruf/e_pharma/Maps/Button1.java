package com.example.maruf.e_pharma.Maps;

import android.widget.Toast;

public class Button1 implements ButtonInterface{

    public void ButtonFunction() {
        mMap.clear();
        String shop = "Diagnostic Center";
        url = getUrl(latitude, longitude, shop);
        dataTransfer[0] = mMap;
        dataTransfer[1] = url;
        getNearbyPlacesData.execute(dataTransfer);
        Toast.makeText(MapsMainActivity.this, "Showing Nearby Gym", Toast.LENGTH_SHORT).show();
    }
}
