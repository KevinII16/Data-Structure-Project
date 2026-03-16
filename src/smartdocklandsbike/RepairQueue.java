/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 */
public class RepairQueue {

    // Inner Node class
    private class QueueNode {
        RepairRequest data;
        QueueNode next;

        public QueueNode(RepairRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue pointers
    private QueueNode front;
    private QueueNode rear;

  
    public RepairQueue() {
        front = null;
        rear = null;
    }

    // Enqueue - add request
    public void enqueue(RepairRequest request) {
        QueueNode newNode = new QueueNode(request);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Repair request added for Bike: " + request.getBikeId());
    }

    // Dequeue - process request
    public RepairRequest dequeue() {

        if (front == null) {
            System.out.println("Repair queue is empty.");
            return null;
        }
        RepairRequest request = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return request;
    }

    // Peek - view next request
    public RepairRequest peek() {
        if (front == null) {
            return null;
        }
        return front.data;
    }

    // Display all requests
    public void displayQueue() {
        if (front == null) {
            System.out.println("Repair queue is empty.");
            return;
        }
        QueueNode current = front;
        System.out.println("Repair Queue:");
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    // Check if empty
    public boolean isEmpty() {
        return front == null;
    }
}
