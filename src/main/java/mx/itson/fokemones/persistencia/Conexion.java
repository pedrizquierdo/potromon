/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.fokemones.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zBook
 */
public class Conexion {
    /**
     * Responsible for connecting the database for querying
     * @return The connection to the program.
     * Null is shown by default.
     */
    public static Connection obtener(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/potromones?user=root&password=administrador");
            
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return conexion;
    }
}
