/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String dbname;
    private String username;
    private String password;

    public ConexaoPostgreSQL(){
        this.host =  "localhost";
        this.port = "5432";
        this.dbname = "teste_json";
        this.username = "postgres";
        this.password = "postgres";
    }
    
    public Connection getConexao() throws SQLException{
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        return DriverManager.getConnection(url, username, password);
    }   
    
}
