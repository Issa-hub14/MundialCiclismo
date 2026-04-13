/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.Competencia;
import Modelo.Competidor;
import Modelo.Equipo;
import Modelo.Fondista;
import Modelo.Velocista;

public class CompetenciaControlador {

    private Competencia competencia;

    public CompetenciaControlador(String nombreEvento) {
        this.competencia = new Competencia(nombreEvento);
    }

    public String agregarEquipo(String nombre, String pais, int capacidad) {
        if (nombre.trim().isEmpty() || pais.trim().isEmpty()) {
            return "El nombre y país del equipo son obligatorios.";
        }
        if (competencia.buscarEquipo(nombre) != null) {
            return "Ya existe un equipo con ese nombre.";
        }
        Equipo equipo = new Equipo(nombre, pais, capacidad);

        competencia.agregarEquipo(equipo);

        return "Equipo agregado correctamente.";

    }

    public String agregarVelocista(String nombreEquipo, String nombre, int edad, String pais, int rankingMundial, double estatura, double peso, double velocidadMaxima) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        if (edad <= 0) {
            return "La edad debe ser mayor a cero.";
        }
        if (rankingMundial <= 0) {
            return "El ranking debe ser mayor a cero.";
        }
        if (estatura <= 0) {
            return "La estatura debe ser mayor a cero.";
        }
        if (peso <= 0) {
            return "El peso debe ser mayor a cero.";
        }
        if (velocidadMaxima <= 0) {
            return "La velocidad máxima debe ser mayor a cero.";
        }

        Velocista v = new Velocista(nombre, edad, pais, rankingMundial, estatura, peso, velocidadMaxima);
        equipo.agregarCompetidor(v);
        return "Velocista agregado correctamente.";
    }

    public String agregarFondista(String nombreEquipo, String nombre, int edad, String pais, int rankingMundial, double estatura, double peso, double distanciaRecorrida) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        if (edad <= 0) {
            return "La edad debe ser mayor a cero.";
        }
        if (rankingMundial <= 0) {
            return "El ranking debe ser mayor a cero.";
        }
        if (estatura <= 0) {
            return "La estatura debe ser mayor a cero.";
        }
        if (peso <= 0) {
            return "El peso debe ser mayor a cero.";
        }
        if (distanciaRecorrida <= 0) {
            return "La distancia debe ser mayor a cero.";
        }

        Fondista f = new Fondista(nombre, edad, pais, rankingMundial, estatura, peso, distanciaRecorrida);
        equipo.agregarCompetidor(f);
        return "Fondista agregado correctamente.";
    }

    public String actualizarRanking(String nombreEquipo, int indiceCompetidor,
            int puntosObtenidos) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        Competidor c = equipo.getCompetidor(indiceCompetidor);
        if (c == null) {
            return "Competidor no encontrado.";
        }
        if (puntosObtenidos < 0) {
            return "Los puntos no pueden ser negativos.";
        }
        c.actualizarRanking(puntosObtenidos);
        return "Ranking actualizado correctamente.\n" + c.obtenerDatos();
    }

    public String obtenerDatosCompetidor(String nombreEquipo, int indiceCompetidor) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        Competidor c = equipo.getCompetidor(indiceCompetidor);
        if (c == null) {
            return "Competidor no encontrado.";
        }
        return c.obtenerDatos();
    }

    public String obtenerDatosEquipo(String nombreEquipo) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        return equipo.obtenerDatosEquipo(true);
    }

    public String obtenerDatosEquipoPorPais(String nombreEquipo, String pais) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return "Equipo no encontrado.";
        }
        return equipo.obtenerDatosEquipo(pais);
    }

    public String generarReporte() {
        return competencia.generarReporte();
    }

    public int getContadorEquipos() {
        return competencia.getContador();
    }

    public int getContadorCompetidores(String nombreEquipo) {
        Equipo equipo = competencia.buscarEquipo(nombreEquipo);
        if (equipo == null) {
            return 0;
        }
        return equipo.getContador();
    }
}
