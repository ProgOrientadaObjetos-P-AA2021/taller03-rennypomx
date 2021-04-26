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
public class Terreno {
        
        private double costo;
        private double ancho;
        private double largo;
        private double area;
        private double valorMetroCuadrado;
        
        public void establecerCosto(){
            costo = area * valorMetroCuadrado;
        }
        
        public void establecerAncho(double c){
            ancho = c;
        }
        
        public void establecerLargo(double c){
            largo = c;
        }
        
        public void establecerArea(){
            area = largo * ancho;
        }
        
        public void establecerValorMetroCuadrado(double c){
            valorMetroCuadrado = c;
        }
        
        public double obtenerCosto() {
            return costo;
        }

        public double obtenerAncho() {
            return ancho;
        }

    public double obtenerLargo() {
           return largo;
        }

    public double obtenerArea() {
           return area;
        }  

    public double obtenerCostoMetroCuadrado() {
           return valorMetroCuadrado;
    } 

}
