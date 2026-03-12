/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 */
public class Bike extends Vehicle {

    
    private String bikeType;   
    private int batteryLevel;  
    private String currentStationId; 

    // Constructor 
    public Bike(String vehicleId, String brand, String colour,String bikeType, int batteryLevel, String currentStationId) {
        super(vehicleId, brand, colour);
        this.bikeType = bikeType;
        this.batteryLevel = batteryLevel;
        this.currentStationId = currentStationId;
    }

    //  abstract method from Vehicle
    @Override
    public String getType() {
        return bikeType + " Bike";
    }

    //  Getters 
    public String getBikeType() {
        return bikeType;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getCurrentStationId() {
        return currentStationId;
    }

    //  Setters 
    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setCurrentStationId(String stationId) {
        this.currentStationId = stationId;
    }

    // toString 
    @Override
    public String toString() {
        return super.toString()
                + " | Battery: " + batteryLevel + "%"
                + " | Station: " + currentStationId;
    }
}