package com.example.shuvo.medicare.Maps;

import com.google.android.gms.maps.GoogleMap;

public class FacadeMaker {

    ButtonInterface bt1;
    ButtonInterface bt2;
    ButtonInterface bt3;
    ButtonInterface bt4;
    //ButtonInterface btn_search;
    Object dataTransfer[]=null;
    String search_id = "";
    String url="";
    public GoogleMap mMap;
    GetNearbyPlacesData getNearbyPlacesData=null;


    public FacadeMaker(String url) {


        this.mMap = mMap;
        this.url =url;
        this.search_id = search_id;
        this.dataTransfer = dataTransfer;
        this.getNearbyPlacesData = getNearbyPlacesData;
        bt1= new Button1("hospital",url);
        bt2= new Button2("pharmacy",url);
        bt3= new Button3("dentist", url);
        bt4= new Button4("gym", url);
        //btn_search= new SearchButton();


    }

    public void Gym_Button(){

        bt4.ButtonFunction();
    }
    public void Dentist_Button(){

        bt3.ButtonFunction();
    }public void Pharmacy_Button(){

        bt2.ButtonFunction();
    }public void Hospital_Button(){

        bt1.ButtonFunction();
    }

}
