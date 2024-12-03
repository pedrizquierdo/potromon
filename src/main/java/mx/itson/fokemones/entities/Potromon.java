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
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
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
  private String imagen;
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
    public static Potromon getById(int id){
            Potromon p = new Potromon ();
        try {
            Connection conexion = Conexion.obtener();
            
            String query = "SELECT id, nombre, descripcion, imagen, puntaje, entrenador_id FROM Potromones WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, id);
            
            ResultSet rs = rs = statement.executeQuery();
            while(rs.next()) {
 
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPuntaje(rs.getInt(4));

            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error " + ex.getMessage());
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
    public static boolean save(String Nombre, String Descripcion, int idEntrenador, int puntaje) {
        boolean resultado = false;
        try{
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO Potromones (Nombre, Descripcion, entrenador_id, puntaje) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                
                statement.setString(1, Nombre);
                statement.setString(2, Descripcion);
                statement.setInt(3, idEntrenador);
                statement.setInt(4, puntaje);
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
        }catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }return resultado;
        
        
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
            ResultSet rs = statement.executeQuery("SELECT Id, Nombre, Descripcion, Puntaje, entrenador_id FROM Potromones");
            while(rs.next()) {
                Potromon p = new Potromon ();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPuntaje(rs.getInt(4));
                
                //Obtenemos un ejemplo de tipo responsable 
                Entrenador e = Entrenador.getById(rs.getInt(5));
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
}

