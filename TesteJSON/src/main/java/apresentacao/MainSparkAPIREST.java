/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import com.google.gson.Gson;
import negocio.Order;
import negocio.OrderController;
import spark.Filter;
import static spark.Spark.before;
import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.patch;
import static spark.Spark.put;

/**
 *
 * @author iapereira
 */
public class MainSparkAPIREST {
    public static void main(String[] args) {
        OrderController controller  = new OrderController();    
        
        before((Filter) (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Content-Type", "application/json");
        });      
        
        get("/orders", (request, response) -> {        
            return controller.listar();                        
        });
        
        get("/orders/:id", (request, response) -> {    
            return controller.obter(Integer.parseInt(request.params(":id")));                              
        });
        
        delete("/orders/:id", (request, response) -> {
            return controller.excluir(Integer.parseInt(request.params(":id")));            
        });
        
        patch("/orders", (request, response) -> {
            Order order = new Gson().fromJson(request.body(), Order.class);
            return controller.atualizar(order);            
        });
        
        put("/orders", (request, response) -> {
            Order order = new Gson().fromJson(request.body(), Order.class);
            return controller.adicionar(order);            
        });
    }
    
}
