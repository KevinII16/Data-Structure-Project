/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author kevinalabi
 */

public class Main {

    public static void main(String[] args) {

        BikeManager manager = new BikeManager();


        // Add Bike
        manager.add(new Bike("B001", "Trek", "Red", "Electric", 80, "S1"));
        manager.add(new Bike("B002", "Giant", "Blue", "Standard", 100, "S2"));

        // View Bike
        System.out.println("\n--- All Bikes ---");
        manager.viewBikes();

        // Search Bike

        System.out.println("\n--- Search Bike B001 ---");
        System.out.println(manager.searchById("B001"));

        // Update
        Bike updated = new Bike("B001", "Trek", "Black", "Electric", 90, "S1");
        manager.update(updated);

        System.out.println("\n--- After Update ---");
        manager.viewBikes();

        // Remove

        manager.remove("B002");

        System.out.println("\n--- After Remove ---");
        manager.viewBikes();


        // Repair Queue
        RepairRequest r1 = new RepairRequest("R001", "B001", "Flat tyre");
        manager.addRepairRequest(r1);

        System.out.println("\n--- Repair Queue ---");
        manager.viewRepairs();

        manager.processRepair();


        // Station
 
        manager.addStation(new Station("S1", "Dock 1", "Dublin", 10));
        manager.viewStations();
    }
}
