/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import negocio.*;

/**
 *
 * @author iapereira
 */
public class OrderDAO {

    private final Gson gson;

    public OrderDAO() {
        this.gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    public ArrayList<Order> listar() {
        try {
            ArrayList<Order> vetOrders = new ArrayList();
            String sql = "SELECT id, info->>'customer' as customer, info->>'items' as items FROM orders ORDER BY id;";
            try (Connection conn = new ConexaoPostgreSQL().getConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Order order = new Order();
                    order.setId(rs.getInt("id"));
                    order.setCustomer(rs.getString("customer"));
                    Item vet[] = this.gson.fromJson(rs.getString("items"), Item[].class);
                    order.getItems().addAll(Arrays.asList(vet));
                    vetOrders.add(order);
                }
            }
            return vetOrders;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean atualizar(Order order) {
        try {
            String sql = "UPDATE orders SET info = ?::JSON WHERE id = ?;";
            try (Connection conn = new ConexaoPostgreSQL().getConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setObject(1, this.gson.toJson(order));
                ps.setInt(2, order.getId());
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public Order obter(int id) {
        try {
            Order order = new Order();
            String sql = "SELECT id, info->>'customer' as customer, info->>'items' as items FROM orders WHERE id = ?;";
            try (Connection conn = new ConexaoPostgreSQL().getConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    order.setId(rs.getInt("id"));
                    order.setCustomer(rs.getString("customer"));
                    Item vet[] = this.gson.fromJson(rs.getString("items"), Item[].class);
                    order.getItems().addAll(Arrays.asList(vet));
                }
            }
            return order;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean excluir(int id) {
        try {
            String sql = "DELETE FROM orders WHERE id = ?";
            try (Connection conn = new ConexaoPostgreSQL().getConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean adicionar(Order order) {
        try {
            String sql = "INSERT INTO orders (info) VALUES (?::JSON)";
            try (Connection conn = new ConexaoPostgreSQL().getConexao()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setObject(1, this.gson.toJson(order));
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
