/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Equipo {
    private String nombre;
    private String pais;
    private Competidor[] competidores;
    private int contador;
    
    public Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Competidor[] getCompetidores() {
        return competidores;
    }

    public void setCompetidores(Competidor[] competidores) {
        this.competidores = competidores;
    }
    
    public void agregarCompetidor(Competidor c){
        if (contador < competidores.length) {
            competidores[contador] = c;
            contador++;  
        }
    }
    public String obtenerDatosEquipo(){
        return "Equipo: "+ nombre +
                "\nPais: " + pais +
                "\nNúmero de competidores: " + contador;
        
    }
}
