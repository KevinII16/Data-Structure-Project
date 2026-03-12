/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 */
public abstract class Vehicle {

  
    private String vehicleId;
    private String brand;
    private String colour;
    private boolean isAvailable;

    // Constructor
    public Vehicle(String vehicleId, String brand, String colour) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.colour = colour;
        this.isAvailable = true; 
    }

    // Abstract Method  
    public abstract String getType();

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //  Setters 
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //  toString 
    @Override
    public String toString() {
        return "[" + getType() + "] ID: " + vehicleId
                + " | Brand: " + brand
                + " | Colour: " + colour
                + " | Available: " + isAvailable;
    }
}