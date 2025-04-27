/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34224
 */
public class ConLimpiezaVidrios extends ServicioAdicional {

    public ConLimpiezaVidrios(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 10.00;
    }
}

