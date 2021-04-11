package com.example.myapplication;

public class World_Time {
    private String countryName;
    private String time;

    public World_Time(String countryName, String time) {
        this.countryName = countryName;
        this.time = time;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getTime() {
        return time;
    }
}
