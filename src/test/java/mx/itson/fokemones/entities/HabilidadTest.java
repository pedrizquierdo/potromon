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
 * @author luismorellb
 */
public class HabilidadTest {
    
    public HabilidadTest() {
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
     * Test of getDescripción method, of class Habilidad.
     */
    @Test
    public void testGetDescripción() {
        System.out.println("getDescripcion");
        Habilidad instance = new Habilidad();
        String expResult = null;
        String result = instance.getDescripción();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescripción method, of class Habilidad.
     */
    @Test
    public void testSetDescripción() {
        System.out.println("setDescripcion");
        String descripción = "Potromon peligroso salvaje";
        Habilidad instance = new Habilidad();
        instance.setDescripción(descripción);
        
    }

    /**
     * Test of getId method, of class Habilidad.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Habilidad instance = new Habilidad();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Habilidad.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Habilidad instance = new Habilidad();
        instance.setId(id);
        
    }

    /**
     * Test of getHabilidad method, of class Habilidad.
     */
    @Test
    public void testGetHabilidad() {
        System.out.println("getHabilidad");
        Habilidad instance = new Habilidad();
        String expResult = null;
        String result = instance.getHabilidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHabilidad method, of class Habilidad.
     */
    @Test
    public void testSetHabilidad() {
        System.out.println("setHabilidad");
        String habilidad = "Tirar lava por la boca";
        Habilidad instance = new Habilidad();
        instance.setHabilidad(habilidad);
        
    }

    /**
     * Test of getProtomon method, of class Habilidad.
     */
    @Test
    public void testGetProtomon() {
        System.out.println("getProtomon");
        Habilidad instance = new Habilidad();
        Potromon expResult = null;
        Potromon result = instance.getProtomon();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProtomon method, of class Habilidad.
     */
    @Test
    public void testSetProtomon() {
        System.out.println("setProtomon");
        Potromon protomon = null;
        Habilidad instance = new Habilidad();
        instance.setProtomon(protomon);
        
    }

    /**
     * Test of getList method, of class Habilidad.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        int idPotromon = 0;
        List<Habilidad> expResult = null;
        List<Habilidad> result = Habilidad.getList(idPotromon);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class Habilidad.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Habilidad> expResult = null;
        List<Habilidad> result = Habilidad.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getById method, of class Habilidad.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Habilidad expResult = null;
        Habilidad result = Habilidad.getById(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class Habilidad.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        int id = 1;
        String habilidad = "Tirar lava por la boca";
        String descripcion = "Potromon peligroso salvaje";
        int potromon_id = 2;
        boolean expResult = false;
        boolean result = Habilidad.edit(id, habilidad, descripcion, potromon_id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class Habilidad.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 2;
        boolean expResult = false;
        boolean result = Habilidad.delete(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class Habilidad.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String habilidad = "Control de la gravedad";
        String descripcion = "Potromon pequeño pasivo, pero extremadamente peligroso";
        int idPotromon = 3;
        boolean expResult = false;
        boolean result = Habilidad.save(habilidad, descripcion, idPotromon);
        assertEquals(expResult, result);
        
    }
    
}
