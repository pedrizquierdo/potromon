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
     * En esta seccion de codigo se utiliza para poder obtener el id del servicio en especifico
     * la fecha de realizacion y la descripcion del problema del servicio
     * @param id es un int el cual es el id del servicio
     * @param fecha_realizacion es un dato tipo date el cual es la fecha que se realizo el servicio
     * @param descripcion_problema es un dato tipo string el cual es la descripcion del problema del servicio realizado
     * @return Un objeto de tipo Servicio que contiene los datos del registro correspondiente.
     * Si no se encuentra el registro, se devuelve un objeto vacío con valores predeterminados.
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
            p.setImagen(rs.getBytes(4)); // Cargar la imagen como bytes
            p.setPuntaje(rs.getInt(5));
        }
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return p;
}

      /**
     * Guarda un registro de Servicio en la base de datos
     * @param fecha dato de tipo date el cual es la fecha de realizacion del servicio
     * @param idResponsable Dato de tipo int el cual es el identificador unico del responsable que realizo el servicio
     * @param descripcionProblema Dato de tipo String el cual es la descripcion del problema del servicio realizado
     * @return true si se guardo exitosamente ; de lo contrario, false.
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
     * Aqui esta seccion de codigo sirve para poder editar desde nuestro programa, la base de datos y poder 
     * modificar toda la tabla de Servicio
     * @param fecha dato de tipo date el cual es la fecha de realizacion del servicio
     * @param idResponsable Dato de tipo int el cual es el identificador unico del responsable que realizo el servicio
     * @param descripcionProblema Dato de tipo String el cual es la descripcion del problema del servicio realizado
     * @return la edicion de los elementos seleccionados del servicio especificado
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
     * En esta seccion de codigo se elimina el id especifico seleccionado de nuestra base de datos
     * @param idServicio es un int el cual es el identificador unico de nuestro servicio especificado
     * @return La eliminacion del identificador unico de nuestro servicio especificado
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
     * Esta seccion de codigo se usa para poder seleccionar todo lo que este dentro de "Servicio"
     * En la base de datos
     * @return todos los datos seleccionados de la base de datos
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
                
                //Obtenemos un ejemplo de tipo responsable 
                Entrenador e = Entrenador.getById(rs.getInt(6));
                p.setEntrenadores(e);
                
                
                //Obtenemos una lista de tipo Actividad
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
    public static boolean editImage(int id, byte[] newImage){
        return aggImage(id, newImage);
    }
    public static boolean deleteImage(int id) {
    boolean resultado = false;
    try {
        Connection conexion = Conexion.obtener();
        String consulta = "UPDATE Potromones SET imagen = NULL WHERE id = ?";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setInt(1, id);
        statement.execute();
        resultado = statement.getUpdateCount() == 1;
        conexion.close();
    } catch (Exception ex) {
        System.err.println("Ocurrió un error al eliminar la imagen: " + ex.getMessage());
    }
    return resultado;
}

    }

