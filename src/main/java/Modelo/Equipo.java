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

    public Equipo(String nombre, String pais, int capacidad) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new Competidor[capacidad];
        this.contador = 0;
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

    public int getContador() {
        return contador;
    }

    public void agregarCompetidor(Competidor c) {
        if (contador < competidores.length) {
            competidores[contador] = c;
            contador++;
        }
    }

    public String obtenerDatosEquipo() {
        return "Equipo: " + nombre
                + "\nPais: " + pais
                + "\nNúmero de competidores: " + contador;

    }

    public String obtenerDatosEquipo(boolean mostrarCompetidores) {
        String resultado = obtenerDatosEquipo();
        if (mostrarCompetidores) {
            resultado += "\nCompetidores:";
            for (int i = 0; i < contador; i++) {
                resultado += "\n  [" + i + "] " + competidores[i].toString();
            }
        }
        return resultado;
    }

    public String obtenerDatosEquipo(String paisFiltro) {
        String resultado = "Equipo: " + nombre + "\nCompetidores de " + paisFiltro + ":";
        int encontrados = 0;
        for (int i = 0; i < contador; i++) {
            if (competidores[i].getPais().equalsIgnoreCase(paisFiltro)) {
                resultado += "\n  [" + i + "] " + competidores[i].toString();

                for (int j = 0; j < competidores[i].getNombre().length(); j++) {
                    if (competidores[i].getNombre().charAt(j) == '*') {
                        resultado += " ← capitán";
                        break;
                    }
                }
                encontrados++;
            }
        }
        if (encontrados == 0) {
            resultado += "\n  No hay competidores de " + paisFiltro;
        }
        return resultado;
    }

    public Competidor getCompetidor(int indice) {
        if (indice >= 0 && indice < contador) {
            return competidores[indice];
        }
        return null;
    }
}
