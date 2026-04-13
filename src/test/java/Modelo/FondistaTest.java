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
public class FondistaTest {
    
    public FondistaTest() {
    }
    
    @Test
    public void testFondista() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        assertEquals("Maria", f.getNombre(),"Fallo en el test");
        assertEquals(28, f.getEdad(),"Fallo en el test");
        assertEquals("Francia", f.getPais(),"Fallo en el test");
        assertEquals(5, f.getRankingMundial(),"Fallo en el test");
        assertEquals(1.70, f.getEstatura(), 0.01,"Fallo en el test");
        assertEquals(65.0, f.getPeso(), 0.01,"Fallo en el test");
        assertEquals(200.0, f.getDistanciaRecorre(), 0.01,"Fallo en el test");
        assertEquals(0, f.getPuntos(),"Fallo en el test");
    }
    
    @Test
    public void testActualizarRankingSubir() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        f.actualizarRanking(3);
        assertEquals(3, f.getPuntos(),"Fallo en el test2");
        assertEquals(2, f.getRankingMundial(),"Fallo en el test2");
    }
    
    @Test
    public void testActualizarRankingBajar() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        f.actualizarRanking(0);
        assertEquals(6, f.getRankingMundial(),"Fallo en el test3");
    }
    
    @Test
    public void testToString() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        String resultado = f.toString();
        assertTrue(resultado.contains("Maria"),"Fallo en el test4");
        assertTrue(resultado.contains("Fondista"),"Fallo en el test4");
        assertTrue(resultado.contains("200.0"),"Fallo en el test4");
    }
    
    @Test
    public void testObtenerDatos() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        String datos = f.obtenerDatos();
        assertTrue(datos.contains("Fondista"),"Fallo en el test5");
        assertTrue(datos.contains("200.0"),"Fallo en el test5");
    }
    
    @Test
    public void testGetDistanciaRecorre() {
        Fondista f = new Fondista("Maria", 28, "Francia", 5, 1.70, 65.0, 200.0);
        double resultado = f.getDistanciaRecorre();
        assertEquals(200.0, resultado, 0.01,"Fallo en el test6");

    }
    
}
