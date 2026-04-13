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
    
    public void agregarEquipo(Equipo e){
        if (contador < equipos.length) {
            equipos[contador] = e;
            contador++;  
        }
    }
    public String generarReporte(){
        return equipos.toString();
    }
}
