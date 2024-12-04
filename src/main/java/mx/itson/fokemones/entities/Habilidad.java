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
 * The Habilidad class represents the abilities of a Potromon. It provides methods to 
 * interact with the abilities in the database, including retrieving, editing, deleting, 
 * and adding abilities.
 * 
 * @author zBook
 */
public class Habilidad {

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

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
     * @return the habilidad
     */
    public String getHabilidad() {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * @return the protomon
     */
    public Potromon getProtomon() {
        return protomon;
    }
    
    /**
     * @param protomon the protomon to set
     */
    public void setProtomon(Potromon protomon) {
        this.protomon = protomon;
    }
    private int id;
    private String habilidad;
    private Potromon protomon;
    private String descripción;
       
     /**
    * Method to retrieve a list of abilities associated with a Potromon by its ID.
    *
    * @param idPotromon The ID of the Potromon.
    * @return A list of Habilidad objects with the data retrieved from the database.
    */
    public static List<Habilidad> getList(int idPotromon) {
        List<Habilidad> habilidades = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "SELECT id, habilidad, descripcion FROM habilidades WHERE potromon_id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, idPotromon);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Habilidad h = new Habilidad();
                h.setId(rs.getInt(1));
                h.setHabilidad(rs.getString(2));
                h.setDescripción(rs.getString(3));
                
                habilidades.add(h);
                
            }
        } catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        } return habilidades;
      
    }
    /**
    * Method to retrieve a list of all abilities from the database.
    *
    * @return A list of Habilidad objects with the data retrieved from the database.
    */  
    public static List<Habilidad> getAll() {
        List<Habilidad> habilidades = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, habilidad, descripcion, potromon_id FROM habilidades");
            while(rs.next()) {
                Habilidad h = new Habilidad();
                h.setId(rs.getInt(1));
                h.setHabilidad(rs.getString(2));
                h.setDescripción(rs.getString(3));
                Potromon p = Potromon.getById(rs.getInt(4));
                h.setProtomon(p);
                habilidades.add(h);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error " + ex.getMessage());
        }
        return habilidades;
    }
    
    /**
    * Method to retrieve an ability by its ID.
    *
    * @param id The ID of the ability to search for.
    * @return A Habilidad object with the data retrieved from the database.
    */
    public static Habilidad getById(int id){
        Habilidad h = new Habilidad ();
        try {
            Connection conexion = Conexion.obtener();
            
            String query = "SELECT id, habilidad, descripcion, potromon_id FROM habilidades WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, id);
            
            ResultSet rs = rs = statement.executeQuery();
            while(rs.next()) {
 
                h.setId(rs.getInt(1));
                h.setHabilidad(rs.getString(2));
                
            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error " + ex.getMessage());
        }
        return h;
    }
    
      /**
    * Method to edit an ability in the database.
    *
    * @param id The ID of the ability.
    * @param habilidad The name of the ability.
    * @param descripcion The description of the ability.
    * @param idPotromon The ID of the associated Potromon.
    * @return true if the update was successful, false otherwise.
    */
    public static boolean edit(int id, String habilidad, String descripcion, int idPotromon) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "UPDATE habilidades SET habilidad = ?, descripcion = ?, potromon_id = ? WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                
                statement.setString(1, habilidad);
                statement.setString(2, descripcion);
                statement.setInt(3, idPotromon);
                statement.setInt(4, id);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
    } 
    
    /**
    * Method to delete an ability from the database by its ID.
    *
    * @param id The ID of the ability to be deleted.
    * @return true if the ability was deleted successfully, false otherwise.
    */
    
    public static boolean delete(int id) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM habilidades WHERE id = ?";
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
    * Method to save a new ability in the database.
    *
    * @param habilidad The name of the ability.
    * @param descripcion The description of the ability.
    * @param idPotromon The ID of the associated Potromon.
    * @return true if the ability was saved successfully, false otherwise.
    */
    public static boolean save(String habilidad, String descripcion, int idPotromon) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO habilidades (habilidad, descripcion, potromon_id) VALUES (?, ?, ?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                
                statement.setString(1, habilidad);
                statement.setString(2, descripcion);
                statement.setInt(3, idPotromon);
                
                
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
        
    }
}