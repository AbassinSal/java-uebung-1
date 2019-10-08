package com.example.de;

public class HousingComplex {

    public static void main(String[] args) {

        Radio radio = new Radio();

        radio.on();
        radio.volumeDown();
        System.out.println(radio.toString());
        radio.off();


    }

}
