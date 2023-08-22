/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;
//Considere que se dispone de la producción de carbón ( en toneladas) de los últimos 12 meses. 
//Con estos datos se quiere calcular e imprimir el promedio anual de toneladas.
//Datos: podCarbon1, podCarbon2…podCarbon12.
//Realice el diagrama de flujo y el programa correspondiente. 
//Pruebe con un conjunto de datos adecuados.

/**
 *
 * @author ingmi
 */
public class ProduccionCarbon {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double prodCarbon = 0;
        double sumaProdCarbon = 0;

        for (int i = 1; i < 13; i++) {

            do {
                System.out.print("Ingrese la cantidad de carbón en toneladas en el mes de " + returnMes(i) + ":");
                prodCarbon = sc.nextDouble();
            } while (prodCarbon < 1);
            
            sumaProdCarbon += prodCarbon;

        }
        
        System.out.println("El promedio de producción anual de carbón es: " + (sumaProdCarbon/12));

    }
    //hago el metodo switch para que me salga el nombre del mes
    public static String returnMes(int mes){
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            default:
                return "Diciembre";
        }
    }
}
