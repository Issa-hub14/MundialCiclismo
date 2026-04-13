/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class EquipoTest {

    public EquipoTest() {
    }

    @Test
    public void testEquipo() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        assertEquals("Colombia", e.getNombre(), "Falla en el test");
        assertEquals("Colombia", e.getPais(), "Falla en el test");
        assertEquals(0, e.getContador(), "Falla en el test");
    }

    @Test
    public void testAgregarCompetidor() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        e.agregarCompetidor(v);
        assertEquals(1, e.getContador(), "Falla en el test2");
    }

    @Test
    public void testNoAgregarCompetidor() {
        Equipo e = new Equipo("Colombia", "Colombia", 2);
        e.agregarCompetidor(new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0));
        e.agregarCompetidor(new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0));
        e.agregarCompetidor(new Velocista("Pedro", 22, "Colombia", 8, 1.75, 70.0, 90.0));
        assertEquals(2, e.getContador(), "Falla en el test3");
    }

    @Test
    public void testGetCompetidor() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        e.agregarCompetidor(v);
        assertNotNull(e.getCompetidor(0), "Falla en el test4");
        assertNull(e.getCompetidor(5), "Falla en el test4");
    }

    @Test
    public void testObtenerDatosEquipo() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        String datos = e.obtenerDatosEquipo();
        assertTrue(datos.contains("Colombia"), "Falla en el test5");
    }

    @Test
    public void testObtenerDatosEquipoConCompetidores() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        e.agregarCompetidor(new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0));
        String datos = e.obtenerDatosEquipo(true);
        assertTrue(datos.contains("Juan"), "Falla en el test6");
        assertTrue(datos.contains("Colombia"), "Falla en el test6");
    }

    @Test
    public void testObtenerDatosEquipoPorPais() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        e.agregarCompetidor(new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0));
        e.agregarCompetidor(new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0));
        String datos = e.obtenerDatosEquipo("Colombia");
        assertTrue(datos.contains("Juan"), "Falla en el test7");
        assertFalse(datos.contains("Maria"), "Falla en el test7");
    }

    @Test
    public void testGetNombre() {
        Equipo e = new Equipo("Rigo", "Colombia", 10);
        String resultado = e.getNombre();
        assertEquals("Rigo", resultado, "Falla en el test8");
    }

    @Test
    public void testGetPais() {
        Equipo e = new Equipo("Rigo", "Colombia", 10);
        String resultado = e.getPais();
        assertEquals("Colombia", resultado, "Falla en el test9");
    }

    @Test
    public void testGetCompetidores() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        e.agregarCompetidor(v);
        assertNotNull(e.getCompetidores());
        assertEquals("Juan", e.getCompetidores()[0].getNombre(), "Falla en el test10");
    }

    @Test
    public void testGetContador() {
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        assertEquals(0, e.getContador(),"Falla en el test11");
        e.agregarCompetidor(new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0));
        assertEquals(1, e.getContador(),"Falla en el test11");
    }

}
