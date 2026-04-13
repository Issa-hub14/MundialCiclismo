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
                      === MUNDIAL DE CICLISMO DE PISTA ===
                      1. Agregar equipo
                      2. Agregar velocista a equipo
                      3. Agregar fondista a equipo
                      4. Actualizar ranking de competidor
                      5. Ver datos de competidor
                      6. Ver datos de equipo
                      7. Ver equipo filtrado por país
                      8. Generar reporte general
                      9. Salir
                      
                      Elige una opción:
                      """;
        
        String opcion = JOptionPane.showInputDialog(menu);
        if (opcion == null) {
            return 9;
        }
        if (!esEnteroValido(opcion)) {
            mostrarMensaje("Ingrese una opción válida.");
            return 0;
        }
        return Integer.parseInt(opcion);
    }

    public String pedirTexto(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        if (texto == null) {
            return "";
        }
        return texto.trim();
    }

    public int pedirEntero(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        if (texto == null) {
            return -1;
        }
        if (!esEnteroValido(texto)) {
            mostrarMensaje("Ingrese un número entero válido.");
            return -1;
        }
        return Integer.parseInt(texto.trim());
    }

    public double pedirDecimal(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        if (texto == null) {
            return -1;
        }
        if (!esDecimalValido(texto)) {
            mostrarMensaje("Ingrese un número válido.");
            return -1;
        }
        return Double.parseDouble(texto.trim());
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    
    private boolean esEnteroValido(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < texto.trim().length(); i++) {
            if (!Character.isDigit(texto.trim().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean esDecimalValido(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        int puntos = 0;
        for (int i = 0; i < texto.trim().length(); i++) {
            char c = texto.trim().charAt(i);
            if (c == '.') {
                puntos++;
                if (puntos > 1) {
                    return false;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
