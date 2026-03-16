/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;

/**
 * @author Kevin Alabi
 * @param <T>
 */
public interface Manageable<T> {

    /**
     * Add a new item to the collection.
     * @param item the object to add
     */
    void add(T item);

    /**
     * Remove an item from the collection by its ID.
     * @param id the unique identifier of the item to remove
     * @return
     */
    boolean remove(String id);

    /**
     * Update an existing item in the collection.
     * @param item the updated object (matched by its ID)
     * @return true if updated successfully, false if not found
     */
    boolean update(T item);
}