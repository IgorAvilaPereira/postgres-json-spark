/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Order {
    
    private int id;
    @Expose 
    private String customer;
    @Expose 
    private ArrayList<Item> items;

    public Order() {
        this.items = new ArrayList();
    }    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customer=" + customer + ", items=" + items + '}';
    }
    
    
    
    
    
}
