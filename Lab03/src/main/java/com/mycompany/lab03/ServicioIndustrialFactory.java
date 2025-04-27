/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author adria
 */
public class ServicioIndustrialFactory implements ServicioFactoryIF {

    @Override
    public ServicioLimpieza crearServicio(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, Object... extra) {
        double multiplicadorRiesgo = (double) extra[0];
        return new ServicioIndustrial(multiplicadorRiesgo, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }
}


