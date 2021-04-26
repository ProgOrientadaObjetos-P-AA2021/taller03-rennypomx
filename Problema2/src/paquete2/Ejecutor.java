/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.EquivalenteHora;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EquivalenteHora converUno = new EquivalenteHora(); 
        EquivalenteHora converDos = new EquivalenteHora(); 

        converUno.establecerHora(25);
        converUno.establecerMinuto();
        converUno.establecerSegundo();
        converUno.establecerDia();

     
        converDos.establecerHora(100);
        converDos.establecerMinuto();
        converDos.establecerSegundo();
        converDos.establecerDia();

        System.out.printf("Para el primer objeto %d horas es equivalente a:"
                + "\n%d minutos\n%dsegundos\n%.2f horas\n\n"
                + "Para el segundo objeto %d horas es equivalente a:"
                + "\n%d minutos\n%d segundos\n%.2f horas\n",
                converUno.obtenerHora(),
                converUno.obtenerMinuto(),
                converUno.obtenerSegundo(),
                converUno.obtenerDia(),
                converDos.obtenerHora(),
                converDos.obtenerMinuto(),
                converDos.obtenerSegundo(),
                converDos.obtenerDia());
    }

}
