/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class CompetenciaControladorIT {

    public CompetenciaControladorIT() {
    }

    @Test
    public void testAgregarEquipo() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        String resultado = controlador.agregarEquipo("Colombia", "Colombia", 10);
        assertEquals("Equipo agregado correctamente.", resultado, "Falla en el test");
    }

    @Test
    public void testAgregarEquipoDuplicado() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        String resultado = controlador.agregarEquipo("Colombia", "Colombia", 10);
        assertEquals("Ya existe un equipo con ese nombre.", resultado,"Falla en el test2");
    }

    @Test
    public void testAgregarEquipoVacio() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        String resultado = controlador.agregarEquipo("", "Colombia", 10);
        assertEquals("El nombre y país del equipo son obligatorios.", resultado,"Falla en el test3");
    }

    @Test
    public void testAgregarVelocista() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        String resultado = controlador.agregarVelocista("Colombia", "Juan", 25,
                "Colombia", 10, 1.80, 75.0, 85.0);
        assertEquals("Velocista agregado correctamente.", resultado,"Falla en el test4");
    }

    @Test
    public void testAgregarVelocistaEquipoNoExiste() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        String resultado = controlador.agregarVelocista("Francia", "Juan", 25,
                "Colombia", 10, 1.80, 75.0, 85.0);
        assertEquals("Equipo no encontrado.", resultado,"Falla en el test5");
    }

    @Test
    public void testAgregarVelocistaEdadInvalida() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        String resultado = controlador.agregarVelocista("Colombia", "Juan", -1,
                "Colombia", 10, 1.80, 75.0, 85.0);
        assertEquals("La edad debe ser mayor a cero.", resultado,"Falla en el test6");
    }

    @Test
    public void testAgregarFondista() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        String resultado = controlador.agregarFondista("Colombia", "Maria", 28,
                "Francia", 5, 1.70, 65.0, 200.0);
        assertEquals("Fondista agregado correctamente.", resultado, "Falla en el test7");
    }

    @Test
    public void testAgregarFondistaEquipoNoExiste() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        String resultado = controlador.agregarFondista("Francia", "Maria", 28,
                "Francia", 5, 1.70, 65.0, 200.0);
        assertEquals("Equipo no encontrado.", resultado,"Falla en el test8");
    }

    @Test
    public void testActualizarRanking() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        controlador.agregarVelocista("Colombia", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String resultado = controlador.actualizarRanking("Colombia", 0, 3);
        assertTrue(resultado.contains("Ranking actualizado correctamente."),"Falla en el test9");
    }

    @Test
    public void testActualizarRankingPuntosNegativos() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        controlador.agregarVelocista("Colombia", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String resultado = controlador.actualizarRanking("Colombia", 0, -1);
        assertEquals("Los puntos no pueden ser negativos.", resultado,"Falla en el test10");
    }

    @Test
    public void testObtenerDatosCompetidor() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        controlador.agregarVelocista("Colombia", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String resultado = controlador.obtenerDatosCompetidor("Colombia", 0);
        assertTrue(resultado.contains("Juan"),"Falla en el test");
        assertTrue(resultado.contains("Velocista"),"Falla en el test11");
    }

    @Test
    public void testObtenerDatosEquipo() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        controlador.agregarVelocista("Colombia", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String resultado = controlador.obtenerDatosEquipo("Colombia");
        assertTrue(resultado.contains("Colombia"),"Falla en el test12");
        assertTrue(resultado.contains("Juan"),"Falla en el test12");
    }

    @Test
    public void testObtenerDatosEquipoPorPais() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Mixto", "Internacional", 10);
        controlador.agregarVelocista("Mixto", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        controlador.agregarFondista("Mixto", "Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        String resultado = controlador.obtenerDatosEquipoPorPais("Mixto", "Colombia");
        assertTrue(resultado.contains("Juan"),"Falla en el test13");
        assertFalse(resultado.contains("Maria"),"Falla en el test13");
    }

    @Test
    public void testGenerarReporte() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        String resultado = controlador.generarReporte();
        assertTrue(resultado.contains("Mundial Ciclismo"),"Falla en el test14");
        assertTrue(resultado.contains("Colombia"),"Falla en el test14");
    }

    @Test
    public void testControlador() {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial Ciclismo");
        controlador.agregarEquipo("Colombia", "Colombia", 10);
        controlador.agregarVelocista("Colombia", "Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        controlador.agregarFondista("Colombia", "Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        controlador.actualizarRanking("Colombia", 0, 5);
        String resultado = controlador.obtenerDatosCompetidor("Colombia", 0);
        assertTrue(resultado.contains("Juan"),"Falla en el test15");
        assertTrue(resultado.contains("5"),"Falla en el test15");
    }

}
