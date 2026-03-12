/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Kevin Alabi
 */
public class RepairRequest {

    //  Status 
    public static final String STATUS_PENDING = "Pending";
    public static final String STATUS_IN_REPAIR = "In Repair";
    public static final String STATUS_COMPLETED = "Completed";

    private final String requestId;
    private final String bikeId;         // which bike needs repair
    private String description;    // fault description
    private String status;
    private final String requestDate;    // auto-set on creation

    //  Constructor 
    public RepairRequest(String requestId, String bikeId, String description) {
        this.requestId = requestId;
        this.bikeId = bikeId;
        this.description = description;
        this.status = STATUS_PENDING;
        this.requestDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    //  Getters 
    public String getRequestId(){
        return requestId; }

    public String getBikeId(){ 
        return bikeId; }

    public String getDescription(){ 
        return description; }

    public String getStatus(){
        return status; }

    public String getRequestDate(){ 
        return requestDate; }

    //  Setters 
    public void setDescription(String description) { this.description = description; }

    public void setStatus(String status) { this.status = status; }

    // toString
    @Override
    public String toString() {
        return "Request ID: " + requestId
                + " | Bike ID: " + bikeId
                + " | Status: " + status
                + " | Date: " + requestDate
                + " | Issue: " + description;
    }
}