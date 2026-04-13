/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabe
 */
import javax.swing.JOptionPane;

public class VistaCompetencia {
     public int mostrarMenu() {
        String menu = """
                      MENU PRINCIPAL
                      1. Agregar equipo a la competencia
                      2. Agregar jugador
                      3. Mostrar el mejor puntaje
                      4. Buscar un equipo
                      5. Mostrar mejor(es) equipo(s)
                      6. Salir
                      
                      Elige una opción:
                      """;

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
