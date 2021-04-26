/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Renny
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipoInstitucion(String t) {
        tipoInstitucion = t;
    }

    public void establecerNumAlumno(int a) {
        numAlumnos = a;
    }

    public void establecerNumDocente(int d) {
        numDocentes = d;
    }

    public void establecerNumSede(int n) {
        numSedes = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public int obtenerNumDocentes() {
        return numDocentes;
    }

    public int obtenerNumSede() {
        return numSedes;
    }
}