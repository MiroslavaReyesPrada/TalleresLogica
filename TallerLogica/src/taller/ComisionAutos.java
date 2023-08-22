/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author ingmi
 */
public class ComisionAutos {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int cantidadAutosVendidos = 0;
        int precioVehiculo = 0;
        double valorComision = 0;
        
        do{
            System.out.print("Ingrese la cantidad de autos vendidos en el mes: ");
            cantidadAutosVendidos = sc.nextInt();
        }while(cantidadAutosVendidos<1);
        
        
        for( int i = 1;i<=cantidadAutosVendidos;i++){
            
            do{
                System.out.print("Ingrese el precio del vehiculo " + i + ": ");
                precioVehiculo = sc.nextInt();
            }while(precioVehiculo<1);
            
            if (precioVehiculo <= 100000){
                valorComision+=(precioVehiculo*0.015);
            }else if (precioVehiculo  > 100000 &&  precioVehiculo <= 250000){
                valorComision+=(precioVehiculo*0.018);
            }else {
                valorComision+=(precioVehiculo*0.023);
            }
        }
        
        System.out.println("La cantidad de autos vendidos en el mes es: " + cantidadAutosVendidos);
        System.out.println("La comisión en el mes fue: " + valorComision);
    }
    
}
