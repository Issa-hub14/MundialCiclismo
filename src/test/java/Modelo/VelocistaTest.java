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
public class VelocistaTest {
    
    public VelocistaTest() {
    }
    
    @Test
    public void testVelocista() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 35.0);
        assertEquals("Juan", v.getNombre(), "Fallo en el test");
        assertEquals(25, v.getEdad(),"Fallo en el test");
        assertEquals("Colombia", v.getPais(),"Fallo en el test");
        assertEquals(10, v.getRankingMundial(),"Fallo en el test");
        assertEquals(1.80, v.getEstatura(), 0.01, "Fallo en el test");
        assertEquals(75.0, v.getPeso(), 0.01, "Fallo en el test");
        assertEquals(35.0, v.getVelocidadMaxima(), 0.01,"Fallo en el test");
        assertEquals(0, v.getPuntos(),"Fallo en el test");
    }
    
    @Test
    public void testActualizarRankingSubir() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        v.actualizarRanking(3);
        assertEquals(3, v.getPuntos(),"Fallo en el test2");
        assertEquals(7, v.getRankingMundial(),"Fallo en el test2");
    }
    
    @Test
    public void testActualizarRankingBajar() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        v.actualizarRanking(0);
        assertEquals(11, v.getRankingMundial(),"Fallo en el test3");
    }
    
    @Test
    public void testToStringContieneVelocista() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String resultado = v.toString();
        assertTrue(resultado.contains("Juan"),"Fallo en el test4");
        assertTrue(resultado.contains("Velocista"),"Fallo en el test4");
        assertTrue(resultado.contains("85.0"),"Fallo en el test4");
    }
    
    @Test
    public void testObtenerDatos() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        String datos = v.obtenerDatos();
        assertTrue(datos.contains("Velocista"),"Fallo en el test5");
        assertTrue(datos.contains("85.0"),"Fallo en el test5");
    }
    
    @Test
    public void testGetVelocidadMaxima() {
        Velocista v = new Velocista("Juan", 25, "Colombia", 10, 1.80, 75.0, 85.0);
        double result = v.getVelocidadMaxima();
        assertEquals(85.0, result, 0.01,"Fallo en el test6");
       
    }

}
