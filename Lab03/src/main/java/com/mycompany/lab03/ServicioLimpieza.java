/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34224
 */
public abstract class ServicioLimpieza {
    protected String direccionCliente;
    protected double duracionHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;
   

    public ServicioLimpieza(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }
     
         
     public double calcularPrecioBase(){
         return tarifaHora*duracionHoras;
     }
     public abstract double calcularPrecioFinal();
}

