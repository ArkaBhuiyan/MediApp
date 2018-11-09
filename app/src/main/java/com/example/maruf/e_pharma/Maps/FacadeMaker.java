package com.example.maruf.e_pharma.Maps;

public class FacadeMaker {

    ButtonInterface bt1;
    ButtonInterface bt2;
    ButtonInterface bt3;
    ButtonInterface bt4;
    ButtonInterface btn_search;

    public FacadeMaker() {

        bt1= new Button1();
        bt2= new Button2();
        bt3= new Button3();
        bt4= new Button4();
        btn_search= new SearchButton();


    }

    public void HospitalButton(){
        bt1.ButtonFunction();
    }
}
