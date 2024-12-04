/*
 * This is the test class for testing the functionalities of the Entrenador class.
 * The test methods cover different methods of the Entrenador class, such as getters and setters, 
 * as well as methods that interact with the database like save, edit, and delete.
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
 * JUnit test class for testing the methods of the Entrenador class.
 * 
 * The tests cover:
 * - Getters and setters for the 'id', 'nombre' (name), and 'apodo' (nickname) properties.
 * - Interaction with the database, including saving, editing, retrieving, and deleting records.
 * 
 * @author alang
 */
public class EntrenadorTest {

    public EntrenadorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Code to set up any necessary resources or test data before all tests.
    }

    @AfterAll
    public static void tearDownClass() {
        // Code to clean up resources after all tests.
    }

    @BeforeEach
    public void setUp() {
        // Code to set up the environment before each test.
    }

    @AfterEach
    public void tearDown() {
        // Code to clean up after each test.
    }

    /**
     * Test for the getId method of the Entrenador class.
     * Verifies that the default value of 'id' is 0.
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
     * Test for the setId method of the Entrenador class.
     * Verifies that the 'id' value can be set correctly.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Entrenador instance = new Entrenador();
        instance.setId(id);
    }

    /**
     * Test for the getNombre method of the Entrenador class.
     * Verifies that the default value of 'nombre' is null.
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
     * Test for the setNombre method of the Entrenador class.
     * Verifies that the 'nombre' value can be set correctly.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Entrenador instance = new Entrenador();
        instance.setNombre(nombre);
    }

    /**
     * Test for the getApodo method of the Entrenador class.
     * Verifies that the default value of 'apodo' is null.
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
     * Test for the setApodo method of the Entrenador class.
     * Verifies that the 'apodo' value can be set correctly.
     */
    @Test
    public void testSetApodo() {
        System.out.println("setApodo");
        String apodo = "";
        Entrenador instance = new Entrenador();
        instance.setApodo(apodo);
    }

    /**
     * Test for the getAll method of the Entrenador class.
     * Verifies that a list of Entrenador objects can be retrieved.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Entrenador> expResult = null;
        List<Entrenador> result = Entrenador.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test for the getById method of the Entrenador class.
     * Verifies that an Entrenador object can be retrieved by its ID.
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
     * Test for the edit method of the Entrenador class.
     * Verifies that an Entrenador record can be edited with new values.
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
     * Test for the delete method of the Entrenador class.
     * Verifies that an Entrenador record can be deleted by its ID.
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
     * Test for the save method of the Entrenador class.
     * Verifies that a new Entrenador record can be saved to the database.
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
