/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * Manages all Bike operations.
 * @author Kevin Alabi
 */
public class BikeManager implements Manageable<Bike>, Searchable<Bike> {
//  Implement Manageable<Bike>  

    @Override
    public void add(Bike bike) {
        System.out.println("add() called for: " + bike.getVehicleId());
    }

    @Override
    public boolean remove(String id) {
        System.out.println("remove() called for ID: " + id);
        return false;
    }

    @Override
    public boolean update(Bike bike) {
        System.out.println("update() called for: " + bike.getVehicleId());
        return false;
    }

    //Implement Searchable<Bike>

    @Override
    public Bike searchById(String id) {
        System.out.println("searchById() called for ID: " + id);
        return null;
    }

    @Override
    public void searchByKeyword(String keyword) {
        System.out.println("searchByKeyword() called with: " + keyword);
    }
}