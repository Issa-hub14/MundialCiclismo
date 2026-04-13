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
public class CompetenciaTest {

    public CompetenciaTest() {
    }

    @Test
    public void testCompetencia() {
        Competencia c = new Competencia("Mundial Ciclismo");
        assertEquals("Mundial Ciclismo", c.getNombreEvento(), "Falla en el test");
        assertEquals(0, c.getContador(), "Falla en el test");
    }

    @Test
    public void testAgregarEquipo() {
        Competencia c = new Competencia("Mundial Ciclismo");
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        c.agregarEquipo(e);
        assertEquals(1, c.getContador(), "Falla en el test2");
    }

    @Test
    public void testNoAgregarEquipo() {
        Competencia c = new Competencia("Mundial Ciclismo");
        for (int i = 0; i < 40; i++) {
            c.agregarEquipo(new Equipo("Equipo" + i, "Pais" + i, 10));
        }
        c.agregarEquipo(new Equipo("Extra", "Extra", 10));
        assertEquals(40, c.getContador(), "Falla en el test3");
    }

    @Test
    public void testBuscarEquipoPorNombre() {
        Competencia c = new Competencia("Mundial Ciclismo");
        c.agregarEquipo(new Equipo("Colombia", "Colombia", 10));
        Equipo resultado = c.buscarEquipo("Colombia");
        assertNotNull(resultado, "Falla en el test4");
        assertEquals("Colombia", resultado.getNombre(), "Falla en el test4");
    }

    @Test
    public void testBuscarEquipoPorNombreNoExiste() {
        Competencia c = new Competencia("Mundial Ciclismo");
        Equipo resultado = c.buscarEquipo("Francia");
        assertNull(resultado, "Falla en el test5");
    }

    @Test
    public void testNoGenerarReporte() {
        Competencia c = new Competencia("Mundial Ciclismo");
        assertEquals("No hay equipos registrados.", c.generarReporte(), "Falla en el test6");
    }

    @Test
    public void testGenerarReporteConEquipos() {
        Competencia c = new Competencia("Mundial Ciclismo");
        c.agregarEquipo(new Equipo("Colombia", "Colombia", 10));
        String reporte = c.generarReporte();
        assertTrue(reporte.contains("Mundial Ciclismo"), "Falla en el test7");
        assertTrue(reporte.contains("Colombia"), "Falla en el test7");
    }

    @Test
    public void testGetEquipos() {
        Competencia c = new Competencia("Mundial Ciclismo");
        Equipo e = new Equipo("Colombia", "Colombia", 10);
        c.agregarEquipo(e);
        assertNotNull(c.getEquipos());
        assertEquals("Colombia", c.getEquipos()[0].getNombre(), "Falla en el test8");
    }

    @Test
    public void testGetContador() {
        Competencia c = new Competencia("Mundial Ciclismo");
        assertEquals(0, c.getContador());
        c.agregarEquipo(new Equipo("Colombia", "Colombia", 10));
        assertEquals(1, c.getContador(),"Falla en el test9");
    }

}
