/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author adria
 */
public class ServicioFactory {

    public static ServicioLimpieza crearServicio(String tipo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, Object... extra) {
        switch (tipo.toLowerCase()) {
            case "hogar":
                boolean esApartamento = (boolean) extra[0];
                return new ServicioHogar(esApartamento, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            case "oficina":
                int cantidadEmpleados = (int) extra[0];
                return new ServicioOficina(cantidadEmpleados, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            case "industrial":
                double multiplicadorRiesgo = (double) extra[0];
                return new ServicioIndustrial(multiplicadorRiesgo, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            default:
                throw new IllegalArgumentException("Tipo de servicio no reconocido: " + tipo);
        }
    }
}

