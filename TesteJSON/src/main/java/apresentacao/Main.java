/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.*;
import persistencia.OrderDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
//        new OrderDAO().excluir(4);
//        new OrderDAO().excluir(5);
//        new OrderDAO().excluir(6);
//        
        
//        Order order = new Order();
//        order.setCustomer("Igor");
//        order.getItems().add(new Item("Tv", 6));
//        new OrderDAO().adicionar(order);


//        System.out.println(new OrderDAO().obter(7).toString());

        Order order = new OrderDAO().obter(7);
//        System.out.println(order);
        order.setCustomer("Igor Pereira");
        new OrderDAO().atualizar(order);

//        new OrderDAO().listar().forEach(x -> System.out.println(x));

    }
}
