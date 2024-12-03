/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.fokemones.entities;

/**
 *
 * @author zBook
 */
public class Habilidad {

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

}
