/*
    Para un sistema, es necesario abstraer las características de 
    dispositivos electrónicos como los son los Equipo Celulares. 
    Cada Equipo Celular tienen como características: sistema operativo,
    tamaño de pantalla, costo, dirección mac, información IMEI.
 */
package paquete2;

import paquete1.EquipoCelular;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EquipoCelular DispositivoUno = new EquipoCelular(); 
        EquipoCelular DispositivoDos = new EquipoCelular(); 

        
        DispositivoUno.establecerSistemOperativo("IOS");
        DispositivoUno.establecerTamañoPantalla(12);
        DispositivoUno.establecerCosto(400);
        DispositivoUno.establecerDirecMac("00:1e:c2:9e:28:6b");
        DispositivoUno.establecerInfoImei("5456156458");

        
        DispositivoDos.establecerSistemOperativo("IOS");
        DispositivoDos.establecerTamañoPantalla(14);
        DispositivoDos.establecerCosto(600);
        DispositivoDos.establecerDirecMac("00:1e:c2:9e:28:6b");
        DispositivoDos.establecerInfoImei("51414515151");

        System.out.printf("-Caracteristicas del primer dispositivo:\n"
                + "Sistema operativo: %s\n"
                + "Tamaño de la pantalla: %d'\n"
                + "Costo: $%.2f\n"
                + "Dirección MAC: %s\n"
                + "Información IMEI: %s\n\n"
                + "-Caracteristicas del segundo dispositivo:\n"
                + "Sistema operativo: %s\n"
                + "Tamaño de la pantalla: %d'\n"
                + "Costo: $%.2f\n"
                + "Dirección MAC: %s\n"
                + "Información IMEI: %s\n",
                DispositivoUno.obtenerSistemOperativo(),
                DispositivoUno.obtenerTamañoPantalla(),
                DispositivoUno.obtenerCosto(),
                DispositivoUno.obtenerDirecMac(),
                DispositivoUno.obtenerInfoImei(),
                DispositivoDos.obtenerSistemOperativo(),
                DispositivoDos.obtenerTamañoPantalla(),
                DispositivoDos.obtenerCosto(),
                DispositivoDos.obtenerDirecMac(),
                DispositivoDos.obtenerInfoImei());

    }

}
