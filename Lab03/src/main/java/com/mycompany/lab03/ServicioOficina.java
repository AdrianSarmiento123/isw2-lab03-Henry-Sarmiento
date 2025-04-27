/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34224
 * ServicioOficina
Atributos adicionales:
int cantidadEmpleados
Reglas:
Se añade 0.1 horas por cada empleado extra.
Al precio final se le aplica el IGV (18%).
Métodos:
double calcularPrecioFinal() –
* Considera el aumento de duración y aplica IGV.
 */
public class ServicioOficina extends ServicioLimpieza {
    private int catindadEmpleados ;

    public ServicioOficina(int catindadEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.catindadEmpleados = catindadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double duracionTotal = duracionHoras+catindadEmpleados*0.1;
        double precioBase=  duracionTotal*tarifaHora ;
          return precioBase- precioBase*0.18;
    }
   
}

    
        
  
