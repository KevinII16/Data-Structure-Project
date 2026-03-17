/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

import java.util.ArrayList;

/**
 * Manages all dock Station objects 
 * @author Kevin Alabi
 */
public class StationManager implements Manageable<Station>, Searchable<Station> {

    private final ArrayList<Station> stations;
    public StationManager() {
        stations = new ArrayList<>();
    }

    // Add station
    @Override
    public void add(Station station) {
        stations.add(station);
        System.out.println("Station added: "+ station.getStationId() + " - " + station.getStationName());
    }
    // Remove the  station by ID
    @Override
    public boolean remove(String stationId) {

        for (int i = 0; i < stations.size(); i++) {

            if (stations.get(i).getStationId().equals(stationId)) {

                stations.remove(i);

                System.out.println("Station removed: " + stationId);
                return true;
            }
        }

        System.out.println("Station not found: " + stationId);
        return false;
    }
    // Updatestation
    @Override
    public boolean update(Station updatedStation) {
        for (int i = 0; i < stations.size(); i++) {
            if (stations.get(i).getStationId().equals(updatedStation.getStationId())) {
                stations.set(i, updatedStation);
                System.out.println("Station updated: "+ updatedStation.getStationId());
                return true;
            }
        }

        System.out.println("Station not found for update.");
        return false;
    }
    // Search by id
    @Override
    public Station searchById(String stationId) {
        for (Station s : stations) {
            if (s.getStationId().equals(stationId)) {
                return s;
            }
        }
        System.out.println("Station not found: " + stationId);
        return null;
    }
    //Search
    @Override
    public void searchByKeyword(String keyword) {
        String lower = keyword.toLowerCase();
        boolean found = false;
        System.out.println("- Station Search: " + keyword + " -");
        for (Station s : stations) {
            if (s.getStationName().toLowerCase().contains(lower)|| s.getLocation().toLowerCase().contains(lower)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No stations matched.");
        }
    }

    // Display Stations
    public void displayAll() {
        if (stations.isEmpty()) {
            System.out.println("No stations registered.");
            return;
        }
        System.out.println("- Dock Stations -");
        for (int i = 0; i < stations.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + stations.get(i));
        }
        System.out.println("Total stations: " + stations.size());
    }
    public ArrayList<Station> getAllStations() {
        return stations;
    }
    public int getSize() {
        return stations.size();
    }
    public boolean isEmpty() {
        return stations.isEmpty();
    }
}