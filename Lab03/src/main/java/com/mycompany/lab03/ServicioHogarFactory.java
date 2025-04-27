/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author adria
 */
public class ServicioHogarFactory implements ServicioFactoryIF {

    @Override
    public ServicioLimpieza crearServicio(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, Object... extra) {
        boolean esApartamento = (boolean) extra[0];
        return new ServicioHogar(esApartamento, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }
}

