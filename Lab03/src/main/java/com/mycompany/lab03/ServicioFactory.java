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

    public static ServicioFactoryIF getFactory(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hogar":
                return new ServicioHogarFactory();
            case "oficina":
                return new ServicioOficinaFactory();
            default:
                return new ServicioIndustrialFactory();
            
                
        }
    }
}


