/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Velocista extends Competidor{
    
    private double velocidadMaxima;

    public Velocista(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso, double velocidadMaxima) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + " | Velocista" +
               " | Vel. Máx: " + velocidadMaxima + " km/h";
    }

    public String obtenerDatos() {
        return super.obtenerDatos() +
               "\nTipo: Velocista" +
               "\nVelocidad Máxima: " + velocidadMaxima + " km/h";
    }

}
