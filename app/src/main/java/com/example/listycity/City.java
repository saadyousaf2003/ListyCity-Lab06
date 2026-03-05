package com.example.listycity;

/**
 * This class represents a City object
 */
public class City implements Comparable<City>{

    private String city;
    private String province;

    /**
     * Constructor
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Used to sort cities alphabetically
     */
    @Override
    public int compareTo(City other){
        return this.city.compareTo(other.getCityName());
    }
}
