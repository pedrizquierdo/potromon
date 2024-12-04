/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.fokemones.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.fokemones.persistencia.Conexion;

/**
 * Represents a Trainer (Entrenador) entity with methods to perform CRUD operations
 * in the database.
 * 
 * Fields:
 * - id: Unique identifier for the trainer.
 * - nombre: Trainer's name.
 * - apodo: Trainer's nickname.
 * 
 * Methods include getting all trainers, retrieving a trainer by ID, editing,
 * deleting, and saving trainers in the database.
 * 
 * Author: zBook
 */
public class Entrenador {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apodo
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * @param apodo the apodo to set
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    private int id;
    private String nombre;
    private String apodo;

/**
     * this seccion of code is used to select everything inside of "Entrenador"
     * in the database
     * @return All the data selected from the database
     */   
    public static List<Entrenador> getAll() {
        List<Entrenador> entrenadores = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, apodo FROM entrenadores");
            while(rs.next()) {
                Entrenador e = new Entrenador();
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApodo(rs.getString(3));
                entrenadores.add(e);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error " + ex.getMessage());
        }
        return entrenadores;
    }
    
    /**
      * In this seccion of code is used to get the ID of the especific "Entrenador".
     * The id of "responsable" name of "Entrenador" and the position of the especific "Entrenador".
     * @param id Is an INT which is the id of the especific "Entrenador".
     * @return An object of type "Entrenador" That contains the data of the corresponding record.
     * If the record is not found, an empty object with default values is returned.
     */
    public static Entrenador getById(int id){
        Entrenador e = new Entrenador ();
        try {
            Connection conexion = Conexion.obtener();
            
            String query = "SELECT id, nombre, apodo FROM entrenadores WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, id);
            
            ResultSet rs = rs = statement.executeQuery();
            while(rs.next()) {
 
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApodo(rs.getString(3));

            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error " + ex.getMessage());
        }
        return e;
    }
    
    
    /**
     * This section of code allows us to edit the database from our program 
     * and modify the entire "Entrenador" table.
     * @param id This is an Int which is the unique identifier of the "Entrenador".
     * @param nombre Is a String which is the unique identifier of the "Entrenador".
     * @param apodo Is a String which is the especific position of the "Entrenador".
     * @return The editing of the selected elements of the specified "entrenador".
     */
    public static boolean edit(int id,String nombre, String apodo) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "UPDATE entrenadores SET nombre = ?, apodo = ? WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombre);
                statement.setString(2, apodo);
                statement.setInt(3, id);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
    } 
    /**
     * In this part of the code deletes the selected especific id from our database.
     * @param id This is an INT which is the unique identifier of our especific "Entrenador".
     * @return The deleted unique identifier of our especific "Entrenador".
     */
    
    public static boolean delete(int id) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM entrenadores WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                
                statement.setInt(1, id);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
    } 
    /**
     * Saves a data of our "entrenador" in the database.
     * @param nombre Value of the "Entrenador" name.
     * @param apodo Value of the "Entrenador" position.
     * @return True if it was successfully saved; otherwise, false.
     */
    public static boolean save(String nombre, String apodo) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO entrenadores (nombre, apodo) VALUES (?, ?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombre);
                statement.setString(2, apodo);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
        
}
    } 
    

