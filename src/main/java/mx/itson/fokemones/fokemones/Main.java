/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.fokemones.fokemones;

import mx.itson.fokemones.persistencia.Conexion;

/**
 * Main class that starts the application.
 * 
 * This class contains the `main` method, which serves as the entry point for program execution.
 * 
 * @author zBook
 */
public class Main {
/**
 * Main method of the program.
 * The application connects to the database as soon as the program is executed.
 * @param args
 */
    public static void main(String[] args) {
        Conexion.obtener();
    }
}
