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
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerHora(int c) {
        horas = c;
    }

    public void establecerMinuto() {
        minutos = horas * 60;
    }

    public void establecerSegundo() {
        segundos = horas * 3600;
    }

    public void establecerDia() {
        dias = (double) horas / 24;
    }

    public int obtenerHora() {
        return horas;
    }

    public int obtenerMinuto() {
        return minutos;
    }

    public int obtenerSegundo() {
        return segundos;
    }

    public double obtenerDia() {
        return dias;
    }

 }
