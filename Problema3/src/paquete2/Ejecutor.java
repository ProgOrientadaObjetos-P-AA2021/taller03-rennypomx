/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InstitucionEducativa instUno = new InstitucionEducativa(); 
        InstitucionEducativa instDos = new InstitucionEducativa(); 

        instUno.establecerNombre("Beatriz Cueva De Ayora");
        instUno.establecerTipoInstitucion("Fiscal");
        instUno.establecerNumAlumno(5000);
        instUno.establecerNumDocente(150);
        instUno.establecerNumSede(1);

       
        instDos.establecerNombre("Manuel Cabrera Lozano");
        instDos.establecerTipoInstitucion("Fiscal");
        instDos.establecerNumAlumno(2000);
        instDos.establecerNumDocente(75);
        instDos.establecerNumSede(1);

        System.out.printf("Primera Institución:\nNombre: %s\nTipo: %s\n"
                + "Alumnos: %d\nDocentes: %d\nSedes: %d\n\n"
                + "Segunda Institución:\nNombre: %s\nTipo: %s\n"
                + "Alumnos: %d\nDocentes: %d\nSedes: %d\n",
                instUno.obtenerNombre(),
                instUno.obtenerTipoInstitucion(),
                instUno.obtenerNumAlumnos(),
                instUno.obtenerNumDocentes(),
                instUno.obtenerNumSede(),
                instDos.obtenerNombre(),
                instDos.obtenerTipoInstitucion(),
                instDos.obtenerNumAlumnos(),
                instDos.obtenerNumDocentes(),
                instDos.obtenerNumSede());
    }

}