/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;
/**
 * @author Kevin Alabi
 */
public class SinglyLinkedList {

    //Head pointer 
    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add new Bike at the end
    public void addBike(Bike bike) {
        Node newNode = new Node(bike);

        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            
            current.next = newNode;
        }

        size++;
        System.out.println("Bike added: " + bike.getVehicleId());
    }

    // Add new bike to the front
    public void addFirst(Bike bike) {
        Node newNode = new Node(bike);

        newNode.next = head;
        head = newNode;

        size++;
        System.out.println("Bike added at front: " + bike.getVehicleId());
    }
    // Remove bike by id
    public boolean removeBike(String vehicleId) {

        if (head == null) {
            System.out.println("List is empty.");
            return false;
        }

        // removing head
        if (head.data.getVehicleId().equals(vehicleId)) {
            head = head.next;
            size--;
            System.out.println("Bike removed: " + vehicleId);
            return true;
        }

        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data.getVehicleId().equals(vehicleId)) {
                previous.next = current.next;
                size--;
                System.out.println("Bike removed: " + vehicleId);
                return true;
            }
            previous = current;
            current = current.next;
        }

        System.out.println("Bike not found: " + vehicleId);
        return false;
    }

    // Find bike by id
    public Bike searchById(String vehicleId) {
        Node current = head;
        while (current != null) {
            if (current.data.getVehicleId().equals(vehicleId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Replace the bike by id
    public boolean updateBike(Bike updatedBike) {
        Node current = head;
        while (current != null) {
            if (current.data.getVehicleId().equals(updatedBike.getVehicleId())) {
                current.data = updatedBike;
                System.out.println("Bike updated: " + updatedBike.getVehicleId());
                return true;
            }
            current = current.next;
        }
        System.out.println("Bike not found for update.");
        return false;
    }
    // Print all bikes
    public void displayAll() {

        if (head == null) {
            System.out.println("No bikes in the system.");
            return;
        }

        Node current = head;
        int index = 1;

        System.out.println("- Bike Fleet - ");

        while (current != null) {
            System.out.println("[" + index + "] " + current.data.toString());
            current = current.next;
            index++;
        }

        System.out.println("Total bikes: " + size);
        System.out.println("");
    }

    // Search
    public void searchByKeyword(String keyword) {
        Node current = head;
        boolean found = false;
        String lower = keyword.toLowerCase();
        while (current != null) {
            Bike b = current.data;
            if (b.getBrand().toLowerCase().contains(lower) || b.getBikeType().toLowerCase().contains(lower)|| b.getColour().toLowerCase().contains(lower)) {
                System.out.println(b.toString());
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No bikes matched \"" + keyword + "\".");
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }
}