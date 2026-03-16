/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdocklandsbike;


/**
 * @author Kevin Alabi
 * @param <T>
 */
public interface Searchable<T> {

    /**
     * Search for an item by its unique ID.
     * @param id the ID to search for
     * @return the found object, or null if not found
     */
    T searchById(String id);

    /**
     * Display all items that match a given keyword.
     * @param keyword the search term (e.g. brand name, station name)
     */
    void searchByKeyword(String keyword);
}