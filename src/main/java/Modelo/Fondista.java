/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Fondista extends Competidor{
    private double distanciaRecorrida;

    public Fondista(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso, double distanciaRecorre) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.distanciaRecorrida = distanciaRecorre;
    }

    public double getDistanciaRecorre() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorre(double distanciaRecorre) {
        this.distanciaRecorrida = distanciaRecorre;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Fondista" +
               " | Dist. Recorrida: " + distanciaRecorrida + " km";
    }

    public String obtenerDatos() {
        return super.obtenerDatos() +
               "\nTipo: Fondista" +
               "\nDistancia que recorre: " + distanciaRecorrida + " km";
    }
}
