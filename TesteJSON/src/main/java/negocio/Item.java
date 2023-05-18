/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.google.gson.annotations.Expose;

/**
 *
 * @author iapereira
 */
public class Item {
    @Expose 
    private String product;
    @Expose 
    private int qty;

    public Item(String product, int qty) {
        this.product = product;
        this.qty = qty;
    }
    
    

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" + "product=" + product + ", qty=" + qty + '}';
    }
    
    
     
    
    

    
}
