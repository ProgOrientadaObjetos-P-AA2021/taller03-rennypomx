/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Terreno;
/**
 *
 * @author Renny
 */
public class Ejecutor {
    
    public static void main(String[] args) {
       
        Terreno terreno1 = new Terreno(); 
        Terreno terreno2 = new Terreno(); 

        terreno1.establecerAncho(100.9);
        terreno1.establecerLargo(500.4);
        terreno1.establecerValorMetroCuadrado(20);
        terreno1.establecerArea();
        terreno1.establecerCosto();

        terreno2.establecerAncho(1459);
        terreno2.establecerLargo(8524);
        terreno2.establecerValorMetroCuadrado(14.5);
        terreno2.establecerArea();
        terreno2.establecerCosto();
        
        
        System.out.printf("-El Primer Terreno Cuenta Con Dimenciones:"
                + "\nLargo: %.2f metros\n"
                + "Ancho: %.2f metros\nContiene un área de: %.2f m2\n"
                + "El valor en Metros cuadrados es de: $%.2f \n"
                + "El valor total del terreno es: $%.2f\n\n"
                + "-El Segundo Terreno Cuenta Con Dimensiones:\n"
                + "Largo: %.2f metros\n"
                + "Ancho: %.2f metros\nContiene un área de: %.2f m2\n"
                + "El valor en Metros cuadrados es de: $%.2f \n"
                + "El valor total del terreno es de: $%.2f\n",
                terreno1.obtenerLargo(),
                terreno1.obtenerAncho(),
                terreno1.obtenerArea(),
                terreno1.obtenerCostoMetroCuadrado(),
                terreno1.obtenerCosto(),
                terreno2.obtenerLargo(),
                terreno2.obtenerAncho(),
                terreno2.obtenerArea(),
                terreno2.obtenerCostoMetroCuadrado(),
                terreno2.obtenerCosto());
    }

}

