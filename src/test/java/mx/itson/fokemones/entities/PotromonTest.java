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
public class PotromonTest {
    
    public PotromonTest() {
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
     * Test of getId method, of class Potromon.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Potromon instance = new Potromon();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Potromon.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Potromon instance = new Potromon();
        instance.setId(id);
        
    }

    /**
     * Test of getNombre method, of class Potromon.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Potromon instance = new Potromon();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Potromon.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Palomyts";
        Potromon instance = new Potromon();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getDescripcion method, of class Potromon.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Potromon instance = new Potromon();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescripcion method, of class Potromon.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "Potromon volador";
        Potromon instance = new Potromon();
        instance.setDescripcion(descripcion);
        
    }

    /**
     * Test of getPuntaje method, of class Potromon.
     */
    @Test
    public void testGetPuntaje() {
        System.out.println("getPuntaje");
        Potromon instance = new Potromon();
        int expResult = 0;
        int result = instance.getPuntaje();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPuntaje method, of class Potromon.
     */
    @Test
    public void testSetPuntaje() {
        System.out.println("setPuntaje");
        int puntaje = 100;
        Potromon instance = new Potromon();
        instance.setPuntaje(puntaje);
        
    }

    /**
     * Test of getEntrenadores method, of class Potromon.
     */
    @Test
    public void testGetEntrenadores() {
        System.out.println("getEntrenadores");
        Potromon instance = new Potromon();
        Entrenador expResult = null;
        Entrenador result = instance.getEntrenadores();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEntrenadores method, of class Potromon.
     */
    @Test
    public void testSetEntrenadores() {
        System.out.println("setEntrenadores");
        Entrenador entrenadores = null;
        Potromon instance = new Potromon();
        instance.setEntrenadores(entrenadores);
        
    }

    /**
     * Test of getHabilidad method, of class Potromon.
     */
    @Test
    public void testGetHabilidad() {
        System.out.println("getHabilidad");
        Potromon instance = new Potromon();
        List<Habilidad> expResult = null;
        List<Habilidad> result = instance.getHabilidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHabilidad method, of class Potromon.
     */
    @Test
    public void testSetHabilidad() {
        System.out.println("setHabilidad");
        List<Habilidad> habilidad = null;
        Potromon instance = new Potromon();
        instance.setHabilidad(habilidad);
        
    }

    /**
     * Test of getById method, of class Potromon.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Potromon expResult = null;
        Potromon result = Potromon.getById(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class Potromon.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String nombre = "";
        String descripcion = "";
        byte[] imagen = null;
        int idEntrenador = 0;
        int puntaje = 0;
        boolean expResult = false;
        boolean result = Potromon.save(nombre, descripcion, imagen, idEntrenador, puntaje);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class Potromon.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        int id = 2;
        int puntaje = 50;
        boolean expResult = true;
        boolean result = Potromon.edit(id, puntaje);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class Potromon.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int Id = 0;
        boolean expResult = false;
        boolean result = Potromon.delete(Id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class Potromon.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Potromon> expResult = null;
        List<Potromon> result = Potromon.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getImagen method, of class Potromon.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Potromon instance = new Potromon();
        byte[] expResult = null;
        byte[] result = instance.getImagen();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setImagen method, of class Potromon.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        byte[] imagen = null;
        Potromon instance = new Potromon();
        instance.setImagen(imagen);
        
    }

    /**
     * Test of aggImage method, of class Potromon.
     */
    @Test
    public void testAggImage() {
        System.out.println("aggImage");
        int id = 0;
        byte[] image = null;
        boolean expResult = false;
        boolean result = Potromon.aggImage(id, image);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of cargarImagen method, of class Potromon.
     */
    @Test
    public void testCargarImagen() {
        System.out.println("cargarImagen");
        int id = 0;
        byte[] expResult = null;
        byte[] result = Potromon.cargarImagen(id);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of editImage method, of class Potromon.
     */
    @Test
    public void testEditImage() {
        System.out.println("editImage");
        int id = 0;
        byte[] newImage = null;
        boolean expResult = false;
        boolean result = Potromon.editImage(id, newImage);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteImage method, of class Potromon.
     */
    @Test
    public void testDeleteImage() {
        System.out.println("deleteImage");
        int id = 2;
        boolean expResult = true;
        boolean result = Potromon.deleteImage(id);
        assertEquals(expResult, result);
        
    }
    
}
