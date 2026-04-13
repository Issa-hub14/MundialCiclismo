/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Competencia {
    private String nombreEvento;
    private Equipo[] equipos;
    private int contador;
    
    public Competencia(String nombreEvento){
        this.nombreEvento = nombreEvento;
        this.equipos = new Equipo[40];
        this.contador = 0;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public int getContador() {
        return contador;
    }
    
    public void agregarEquipo(Equipo e){
        if (contador < equipos.length) {
            equipos[contador] = e;
            contador++;  
        }
    }
    
    public String generarReporte(){
        if (contador == 0) {
            return "No hay equipos registrados.";
        }
        String reporte = "=== " + nombreEvento + " ===\n";
        reporte += "Total de equipos: " + contador + "\n\n";
        for (int i = 0; i < contador; i++) {
            reporte += "[" + i + "] " + equipos[i].obtenerDatosEquipo() + "\n\n";
        }
        return reporte;
    }
    
    public Equipo buscarEquipo(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (equipos[i].getNombre().equalsIgnoreCase(nombre)) {
            return equipos[i];
        }
    }
    return null;
}
}
