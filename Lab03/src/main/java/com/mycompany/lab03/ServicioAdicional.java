/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34224
 */
public abstract class ServicioAdicional extends ServicioLimpieza {
    protected ServicioLimpieza servicio;

    public ServicioAdicional(ServicioLimpieza servicio) {
        super(servicio.direccionCliente, servicio.duracionHoras, servicio.tarifaHora, servicio.incluyeMateriales, servicio.nombreCliente);
        this.servicio = servicio;
    }
}

