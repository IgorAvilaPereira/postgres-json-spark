/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.google.gson.Gson;
import persistencia.OrderDAO;

/**
 *
 * @author iapereira
 */
public class OrderController {
    private Gson gson;
    private OrderDAO orderDAO;
    
    public OrderController(){
        this.orderDAO = new OrderDAO();
    }

    public String listar() {        
        return new Gson().toJson(this.orderDAO.listar());
    }

    public boolean excluir(int id) {       
       return this.orderDAO.excluir(id);       
    }    

    public boolean adicionar(Order order) {
        return this.orderDAO.adicionar(order);
    }

    public boolean atualizar(Order order) {
        return this.orderDAO.atualizar(order);
    }
}
