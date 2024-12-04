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
 *
 * @author zBook
 */
public class Potromon {

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the entrenadores
     */
    public Entrenador getEntrenadores() {
        return entrenadores;
    }

    /**
     * @param entrenadores the entrenadores to set
     */
    public void setEntrenadores(Entrenador entrenadores) {
        this.entrenadores = entrenadores;
    }

    /**
     * @return the habilidad
     */
    public List<Habilidad> getHabilidad() {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(List<Habilidad> habilidad) {
        this.habilidad = habilidad;
    }
  private int id;
  private String nombre;
  private String descripcion;
  private byte[] imagen;
  private int puntaje;
  private Entrenador entrenadores;
  private List<Habilidad> habilidad;
      /**
     *  In this seccion of code is used to get the ID of the especific "Potromon".
     * The id of "responsable" name of "Potromon" and the position of the especific "Potromon".
     * @param id Is an INT which is the id of the especific "Potromon".
     * @param nombre Is a String which is the name of the especific "Potromon".
     * @param puesto Is a String which is the assigned position of the especific "Potromon".
     * @return An object of type "Potron" That contains the data of the corresponding record.
     * If the record is not found, an empty object with default values is returned.
     */
   public static Potromon getById(int id) {
    Potromon p = new Potromon();
    try {
        Connection conexion = Conexion.obtener();
        String query = "SELECT id, nombre, descripcion, imagen, puntaje, entrenador_id FROM Potromones WHERE id = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id);
        
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setDescripcion(rs.getString(3));
            p.setImagen(rs.getBytes(4)); // Load the image as a Bytes
            p.setPuntaje(rs.getInt(5));
        }
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return p;
}

      /**
     * Stores a service record in the database.
     * @param fecha A date type data which is the date the service was performed.
     * @param idResponsable An int type data which is the unique identifier of the person responsible for performing the service.
     * @param descripcionProblema A String type data which is the description of the service problem.
     * @return true if saved successfully; otherwise, false
     */
    public static boolean save(String nombre, String descripcion, byte[] imagen, int idEntrenador, int puntaje) {
    boolean resultado = false;
    try {
        Connection conexion = Conexion.obtener();
        String consulta = "INSERT INTO Potromones (Nombre, Descripcion, Imagen, entrenador_id, puntaje) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        
        statement.setString(1, nombre);
        statement.setString(2, descripcion);
        statement.setBytes(3, imagen); // Guardar la imagen como bytes
        statement.setInt(4, idEntrenador);
        statement.setInt(5, puntaje);
        
        statement.execute();
        resultado = statement.getUpdateCount() == 1;
        conexion.close();
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return resultado;    
    }
     /**
     * This section of code allows us to edit the database from our program and modify the entire 'Servicio' table.
     * @param fecha A date type data, which is the date the service was performed.
     * @param idResponsable An int type data, which is the unique identifier of the person responsible for performing the service.
     * @param descripcionProblema A String type data, which is the description of the service problem.
     * @return The editing of the selected elements of the specified service.  
     */
    
    public static boolean edit(int id, int puntaje) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "UPDATE potromones SET puntaje = puntaje + ? WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setInt(1, puntaje);
              
                statement.setInt(2, id);
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
    } 
     /**
     * In this section of code the selected specific ID is deleted from our database.
     * @param idServicio An int which is the unique identifier of the specified service.
     * @return The deletion of the unique identifier of the specified service.
     */
    public static boolean delete(int Id) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM Potromones WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                
                statement.setInt(1, Id);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
    } 
    
     /**
     * This section of code is used to select everything within "Potromon" in the database     
     * @return All the data selected from the database.
     */   
    public static List<Potromon> getAll (){
        List<Potromon> potromones = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT Id, Nombre, Descripcion,Imagen, Puntaje, entrenador_id FROM Potromones");
            while(rs.next()) {
                Potromon p = new Potromon ();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setImagen(rs.getBytes(4));
                p.setPuntaje(rs.getInt(5));
                
                //We obtain an example of a 'Entrenador' type.
                Entrenador e = Entrenador.getById(rs.getInt(6));
                p.setEntrenadores(e);
                
                
                //We obtain a list of 'Habilidades' type.
                List<Habilidad> habilidades = Habilidad.getList(rs.getInt(1));
                p.setHabilidad(habilidades);
                
                potromones.add(p);
                
            }
            
       
        } catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        } return potromones; 
    } 

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    /**
     * This method is used to update the image of a Potromon in the database.
     * @param id An int that represents the unique identifier of the Potromon to which the new image will be assigned.
     * @param imageA byte array that contains the binary data of the image to be stored.
     * @return True if the image has been successfully added, otherwise false.
     */
    public static boolean aggImage(int id, byte[] image){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE Potromones SET imagen = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setBytes(1, image);
            statement.setInt(2, id);
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        }catch (Exception ex){
            System.err.println("Ocurrio un error al agregar una imagen " + ex.getMessage());
        }
        return resultado;
    }
    /**
     * This method is used to load the image associated with a Potromon from the database.
     * @param id An int that represents the unique identifier of the Potromon whose image is to be loaded.
     * @return True if the image has been successfully updated otherwise false.
     */
    public static byte[] cargarImagen(int id){
        byte[] image = null;
        try{
            Connection conexion =  Conexion.obtener();
            String consulta = "SELECT imagen FROM potromones WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                image = rs.getBytes(1);
            }
            conexion.close();
        } catch (Exception ex){
            System.err.println("Ocurrio un error al cargar la imagen " + ex.getMessage());
        }
        return image;
    }
    /**
     * This method is used to edit the image of a Potromon in the database.
     * @param id An int representing the unique identifier of the Potromon whose image is to be edited.
     * @param newImage A byte array containing the binary data of the new image.
     * @return True if the image has been successfully updated, otherwise false.
     */
    public static boolean editImage(int id, byte[] newImage){
        return aggImage(id, newImage);
    }

    }

