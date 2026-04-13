/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

/**
 *
 * @author isabe
 */
import Controlador.CompetenciaControlador;
import Vista.VistaCompetencia;

public class main {

    public static void main(String[] args) {
        CompetenciaControlador controlador = new CompetenciaControlador("Mundial de Ciclismo de Pista");
        VistaCompetencia vista = new VistaCompetencia();

        int opcion = 0;
        while (opcion != 9) {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombreEquipo = vista.pedirTexto("Nombre del equipo:");
                    if (nombreEquipo.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    String paisEquipo = vista.pedirTexto("País del equipo:");
                    if (paisEquipo.isEmpty()) {
                        vista.mostrarMensaje("El país no puede estar vacío.");
                        break;
                    }
                    int capacidad = vista.pedirEntero("Capacidad del equipo:");
                    if (capacidad <= 0) {
                        break;
                    }
                    vista.mostrarMensaje(controlador.agregarEquipo(nombreEquipo, paisEquipo, capacidad));
                    break;

                case 2:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }

                    String equiVelocista = vista.pedirTexto("Nombre del equipo:");

                    if (equiVelocista.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    String nomVelocista = vista.pedirTexto("Nombre del velocista:");
                    if (nomVelocista.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    int edadV = vista.pedirEntero("Edad:");
                    if (edadV <= 0) {
                        break;
                    }
                    String paisV = vista.pedirTexto("País:");
                    if (paisV.isEmpty()) {
                        vista.mostrarMensaje("El país no puede estar vacío.");
                        break;
                    }
                    int rankingV = vista.pedirEntero("Ranking mundial:");
                    if (rankingV <= 0) {
                        break;
                    }
                    double estaturaV = vista.pedirDecimal("Estatura (m):");
                    if (estaturaV <= 0) {
                        break;
                    }
                    double pesoV = vista.pedirDecimal("Peso (kg):");
                    if (pesoV <= 0) {
                        break;
                    }
                    double velMax = vista.pedirDecimal("Velocidad máxima (km/h):");
                    if (velMax <= 0) {
                        break;
                    }
                    vista.mostrarMensaje(controlador.agregarVelocista(equiVelocista, nomVelocista,
                            edadV, paisV, rankingV, estaturaV, pesoV, velMax));
                    break;

                case 3:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    String equiFondista = vista.pedirTexto("Nombre del equipo:");
                    if (equiFondista.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    String nomFondista = vista.pedirTexto("Nombre del fondista:");
                    if (nomFondista.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    int edadF = vista.pedirEntero("Edad:");
                    if (edadF <= 0) {
                        break;
                    }
                    String paisF = vista.pedirTexto("País:");
                    if (paisF.isEmpty()) {
                        vista.mostrarMensaje("El país no puede estar vacío.");
                        break;
                    }
                    int rankingF = vista.pedirEntero("Ranking mundial:");
                    if (rankingF <= 0) {
                        break;
                    }
                    double estaturaF = vista.pedirDecimal("Estatura (m):");
                    if (estaturaF <= 0) {
                        break;
                    }
                    double pesoF = vista.pedirDecimal("Peso (kg):");
                    if (pesoF <= 0) {
                        break;
                    }
                    double distancia = vista.pedirDecimal("Distancia que recorre (km):");
                    if (distancia <= 0) {
                        break;
                    }
                    vista.mostrarMensaje(controlador.agregarFondista(equiFondista, nomFondista,
                            edadF, paisF, rankingF, estaturaF, pesoF, distancia));
                    break;

                case 4:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    String equiRanking = vista.pedirTexto("Nombre del equipo:");
                    if (equiRanking.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    vista.mostrarMensaje(controlador.obtenerDatosEquipo(equiRanking));
                    int indiceRanking = vista.pedirEntero("Índice del competidor:");
                    if (indiceRanking < 0) {
                        break;
                    }
                    int puntos = vista.pedirEntero("Puntos obtenidos:");
                    if (puntos < 0) {
                        break;
                    }
                    vista.mostrarMensaje(controlador.actualizarRanking(equiRanking, indiceRanking, puntos));
                    break;

                case 5:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    String equiDatos = vista.pedirTexto("Nombre del equipo:");
                    if (equiDatos.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    vista.mostrarMensaje(controlador.obtenerDatosEquipo(equiDatos));
                    int indiceDatos = vista.pedirEntero("Índice del competidor:");
                    if (indiceDatos < 0) {
                        break;
                    }
                    vista.mostrarMensaje(controlador.obtenerDatosCompetidor(equiDatos, indiceDatos));
                    break;

                case 6:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    String equiInfo = vista.pedirTexto("Nombre del equipo:");
                    if (equiInfo.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    vista.mostrarMensaje(controlador.obtenerDatosEquipo(equiInfo));
                    break;

                case 7:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    String equiPais = vista.pedirTexto("Nombre del equipo:");
                    if (equiPais.isEmpty()) {
                        vista.mostrarMensaje("El nombre no puede estar vacío.");
                        break;
                    }
                    String paisFiltro = vista.pedirTexto("País a filtrar:");
                    if (paisFiltro.isEmpty()) {
                        vista.mostrarMensaje("El país no puede estar vacío.");
                        break;
                    }
                    vista.mostrarMensaje(controlador.obtenerDatosEquipoPorPais(equiPais, paisFiltro));
                    break;

                case 8:
                    if (controlador.getContadorEquipos() == 0) {
                        vista.mostrarMensaje("No hay equipos registrados. Agregue un equipo primero.");
                        break;
                    }
                    vista.mostrarMensaje(controlador.generarReporte());
                    break;

                case 9:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }
}
