/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 */
public class Station {

    //
    private final String stationId;
    private String stationName;
    private String location;
    private int totalDocks;
    private int availableDocks;

    //  Constructor
    public Station(String stationId, String stationName, String location, int totalDocks) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.location = location;
        this.totalDocks = totalDocks;
        this.availableDocks = totalDocks; 
    }

    // Getters 
    public String getStationId() { return stationId; }
    public String getStationName() { return stationName; }
    public String getLocation() { return location; }
    public int getTotalDocks() { return totalDocks; }
    public int getAvailableDocks() { return availableDocks; }

    //  Setters 
    public void setStationName(String stationName) { this.stationName = stationName; }
    public void setLocation(String location) { this.location = location; }
    public void setTotalDocks(int totalDocks) { this.totalDocks = totalDocks; }
    public void setAvailableDocks(int availableDocks) { this.availableDocks = availableDocks; }

    // Utility Methods 
    public void dockBike() { if (availableDocks > 0) availableDocks--; }
    public void undockBike() { if (availableDocks < totalDocks) availableDocks++; }

    //  toString 
    @Override
    public String toString() {
        return "Station ID: " + stationId
             + " | Name: " + stationName
             + " | Location: " + location
             + " | Docks: " + availableDocks + "/" + totalDocks + " free";
    }
}