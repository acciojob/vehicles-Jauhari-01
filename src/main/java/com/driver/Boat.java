package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public Boat(String name,int cap){
        this.name = name;
        this.capacity = cap;
    }

    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return this.capacity ;
    }
}