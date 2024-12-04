/*
 * Test class for the Habilidad (Ability) entity.
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
 * Unit test class for the Habilidad entity class.
 * It contains tests for the Habilidad class methods.
 */
public class HabilidadTest {

    public HabilidadTest() {
    }

    /**
     * Sets up any resources before the first test in the class.
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Cleans up resources after all tests in the class have run.
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Sets up resources before each test method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Cleans up resources after each test method.
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of the getDescripción method, of the Habilidad class.
     * It checks that the description is initially null.
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
     * Test of the setDescripción method, of the Habilidad class.
     * It sets a description and verifies the method does not throw exceptions.
     */
    @Test
    public void testSetDescripción() {
        System.out.println("setDescripcion");
        String descripción = "Potromon peligroso salvaje";
        Habilidad instance = new Habilidad();
        instance.setDescripción(descripción);
    }

    /**
     * Test of the getId method, of the Habilidad class.
     * It checks the default ID value.
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
     * Test of the setId method, of the Habilidad class.
     * It sets the ID and verifies the method does not throw exceptions.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Habilidad instance = new Habilidad();
        instance.setId(id);
    }

    /**
     * Test of the getHabilidad method, of the Habilidad class.
     * It checks that the habilidad (ability) is initially null.
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
     * Test of the setHabilidad method, of the Habilidad class.
     * It sets a habilidad (ability) and verifies the method does not throw exceptions.
     */
    @Test
    public void testSetHabilidad() {
        System.out.println("setHabilidad");
        String habilidad = "Tirar lava por la boca";
        Habilidad instance = new Habilidad();
        instance.setHabilidad(habilidad);
    }

    /**
     * Test of the getProtomon method, of the Habilidad class.
     * It checks the default Protomon value, which is initially null.
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
     * Test of the setProtomon method, of the Habilidad class.
     * It sets the Protomon and verifies the method does not throw exceptions.
     */
    @Test
    public void testSetProtomon() {
        System.out.println("setProtomon");
        Potromon protomon = null;
        Habilidad instance = new Habilidad();
        instance.setProtomon(protomon);
    }

    /**
     * Test of the getList method, of the Habilidad class.
     * It checks the result of getting all abilities for a given Protomon.
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
     * Test of the getAll method, of the Habilidad class.
     * It checks the result of getting all abilities.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Habilidad> expResult = null;
        List<Habilidad> result = Habilidad.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of the getById method, of the Habilidad class.
     * It checks the result of getting a specific ability by ID.
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
     * Test of the edit method, of the Habilidad class.
     * It checks the result of editing an ability.
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
     * Test of the delete method, of the Habilidad class.
     * It checks the result of deleting an ability.
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
     * Test of the save method, of the Habilidad class.
     * It checks the result of saving a new ability.
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
