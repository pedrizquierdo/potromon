/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.fokemones.entities;

import java.util.List;

/**
 *
 * @author zBook
 */
public class Potromones {

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
    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    /**
     * @param entrenadores the entrenadores to set
     */
    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    /**
     * @return the habilidad
     */
    public List<Habilidades> getHabilidad() {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(List<Habilidades> habilidad) {
        this.habilidad = habilidad;
    }
  private int id;
  private String nombre;
  private String descripcion;
  private String imagen;
  private int puntaje;
  private Entrenadores entrenadores;
  private List<Habilidades> habilidad;
}
