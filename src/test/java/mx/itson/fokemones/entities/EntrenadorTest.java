/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.fokemones.entities;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alang
 */
public class EntrenadorTest {
    
    public EntrenadorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Entrenador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Entrenador instance = new Entrenador();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Entrenador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Entrenador instance = new Entrenador();
        instance.setId(id);
        
    }

    /**
     * Test of getNombre method, of class Entrenador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Entrenador instance = new Entrenador();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Entrenador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Entrenador instance = new Entrenador();
        instance.setNombre(nombre);
    }

    /**
     * Test of getApodo method, of class Entrenador.
     */
    @Test
    public void testGetApodo() {
        System.out.println("getApodo");
        Entrenador instance = new Entrenador();
        String expResult = null;
        String result = instance.getApodo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApodo method, of class Entrenador.
     */
    @Test
    public void testSetApodo() {
        System.out.println("setApodo");
        String apodo = "";
        Entrenador instance = new Entrenador();
        instance.setApodo(apodo);
    }

    /**
     * Test of getAll method, of class Entrenador.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Entrenador> expResult = null;
        List<Entrenador> result = Entrenador.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getById method, of class Entrenador.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Entrenador expResult = null;
        Entrenador result = Entrenador.getById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class Entrenador.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        int id = 1;
        String nombre = "Alan";
        String apodo = "Sasi";
        boolean expResult = false;
        boolean result = Entrenador.edit(id, nombre, apodo);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Entrenador.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 1;
        boolean expResult = false;
        boolean result = Entrenador.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of save method, of class Entrenador.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String nombre = "Alan";
        String apodo = "Sasi";
        boolean expResult = true;
        boolean result = Entrenador.save(nombre, apodo);
        assertEquals(expResult, result);
    }
    
}
