/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.fokemones.fokemones;

import mx.itson.fokemones.persistencia.Conexion;

/**
 *
 * @author zBook
 */
public class Main {
/**
 * The application connects to the database as soon as the program is executed.
 */
    public static void main(String[] args) {
        Conexion.obtener();
    }
}
