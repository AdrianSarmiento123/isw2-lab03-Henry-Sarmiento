/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03;

/**
 *
 * @author L34224
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        
        ServicioHogar servicioHogar = new ServicioHogar(true, "Calle 1", 3, 50, true, "Pedro Pérez");
        ServicioOficina servicioOficina = new ServicioOficina(10, "Avenida 2", 5, 60, true, "Oficina SAC");
        ServicioIndustrial servicioIndustrial = new ServicioIndustrial(1.8, "Zona Industrial", 8, 100, true, "Industria SAC");
        
        System.out.println("Servicio Hogar - Precio Final: S/ " + servicioHogar.calcularPrecioFinal());
        System.out.println("Servicio Oficina - Precio Final: S/ " + servicioOficina.calcularPrecioFinal());
        System.out.println("Servicio Industrial - Precio Final: S/ " + servicioIndustrial.calcularPrecioFinal());
        
        System.out.println("\nEjercicio 2");
        
        Descuento descuentoFrecuente = new DescuentoClienteFrecuente();
        Descuento descuentoCampania = new DescuentoCampania();
        
        double precioOriginal = servicioHogar.calcularPrecioFinal();
        
        double precioConDescuentoFrecuente = descuentoFrecuente.aplicarDescuento(precioOriginal);
        double precioConDescuentoCampania = descuentoCampania.aplicarDescuento(precioOriginal);
        
        System.out.println("Precio original: S/ " + precioOriginal);
        System.out.println("Precio con Descuento Cliente Frecuente: S/ " + precioConDescuentoFrecuente);
        System.out.println("Precio con Descuento Campaña: S/ " + precioConDescuentoCampania);
        
        System.out.println("\nEjercicio 3");
        
        ServicioLimpieza servicioDecorado = new ServicioOficina(5, "Oficina Central", 4, 70, true, "Oficinas Perú");
        
        servicioDecorado = new ConAromatizante(servicioDecorado);
        servicioDecorado = new ConDesinfeccion(servicioDecorado);
        
        System.out.println("Servicio Oficina con Aromatizante y Desinfección - Precio Final: S/ " + servicioDecorado.calcularPrecioFinal());
        
        System.out.println("\nEjercicio 4");
        
        ServicioLimpieza servicioDesdeFactory = ServicioFactory.crearServicio(
            "hogar",
            "Jr. Los Pinos 456",
            2.5,
            45,
            true,
            "Ana Gomez",
            true // esApartamento
        );
        
        System.out.println("Servicio creado por Factory: " + servicioDesdeFactory.getClass().getSimpleName());
        System.out.println("Cliente: " + servicioDesdeFactory.nombreCliente);
        System.out.println("Dirección: " + servicioDesdeFactory.direccionCliente);
        System.out.println("Precio Final: S/ " + servicioDesdeFactory.calcularPrecioFinal());
    }
}

