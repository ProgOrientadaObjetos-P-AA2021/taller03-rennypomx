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
public class EquipoCelular {

    private String sistemOperativo;
    private int tamañoPantalla;
    private double costo;
    private String direcMac;
    private String infoImei;

    public void establecerSistemOperativo(String n) {
        sistemOperativo = n;
    }

    public void establecerTamañoPantalla(int n) {
        tamañoPantalla = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public void establecerDirecMac(String n) {
        direcMac = n;
    }

    public void establecerInfoImei(String n) {
        infoImei = n;
    }

    public String obtenerSistemOperativo() {
        return sistemOperativo;
    }

    public int obtenerTamañoPantalla() {
        return tamañoPantalla;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDirecMac() {
        return direcMac;
    }

    public String obtenerInfoImei() {
        return infoImei;
    }

    }

