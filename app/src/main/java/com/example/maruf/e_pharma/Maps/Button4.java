package com.example.shuvo.medicare.Maps;

import com.google.android.gms.maps.GoogleMap;

public class Button4 implements ButtonInterface{
    Object dataTransfer[]=null;
    String search_id = "";
    String url="";
    public GoogleMap mMap;
    GetNearbyPlacesData getNearbyPlacesData = null;

    public Button4(String search_id, String url ){
        this.search_id =search_id;
        this.url=url;
    }



    public void ButtonFunction() {

        mMap.clear();
        //this.search_id =search_id;
        //url = getUrl(latitude, longitude, search_id);
        dataTransfer[0] = mMap;
        dataTransfer[1] = url;
        getNearbyPlacesData.execute(dataTransfer);



        //Toast.makeText(Button1.this, "Showing Nearby Gym", Toast.LENGTH_SHORT).show();
    }
}
