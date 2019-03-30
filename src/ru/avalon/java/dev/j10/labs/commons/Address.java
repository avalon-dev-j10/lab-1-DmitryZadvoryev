package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    
private String country;
private String city;
private String street;
private String numberOfHouse;
private String door;

public Address(String country, String city, String street, String numberOfHouse){
    
    this.country = country;
    this.city = city;
    this.street = street;
    this.numberOfHouse = numberOfHouse;
}

public Address(String country, String city, String street, String numberOfHouse, String door){
    
    this(country, city, street, numberOfHouse);
    this.door = door;
}

    public String get(){
    
        return country + 
                " " + 
                city + 
                " " + 
                street + 
                " " + 
                numberOfHouse + 
                " " + 
                door;
    
    }

    public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    } 
    public String getStreet(){
        return street;
    }  
    public String getNumberOfHouse(){
        return numberOfHouse;
    } 
    public String getDoor(){
        return door;
    }  
    public void setCountry(String country){
        this.country = country;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setNumberOfHouse(String numberOfHouse){
        this.numberOfHouse = numberOfHouse;
    }
    public void setNumberOfApartment(String door){
        this.door = door;
    }
}