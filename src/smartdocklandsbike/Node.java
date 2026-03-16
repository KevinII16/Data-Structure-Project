/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 */
public class Node {

    Bike data;   
    Node next;  

    public Node(Bike data) {
        this.data = data;
        this.next = null; 
    }
}
