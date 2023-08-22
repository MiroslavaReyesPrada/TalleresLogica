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
public class AreaPerimetro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Dados los lados de un rectángulo , calcular e imprimir el área y el perímetro.
//Datos: base y altura Realice el diagrama de flujo, el seudocódigo y el programa correspondiente a la solución de este problema. Pruebe la solución con un conjunto de datos adecuado.

        double area = 0d;
        double perimetro = 0d;
        double a = 0d;
        double b = 0d;

        System.out.println("Para hallar el área y perimetro del rectángulo ingrese los siguientes datos:");
        System.out.println("Ingrese la base:");
        a = sc.nextDouble();
        System.out.println("ingrese la altura en cm");
        b = sc.nextDouble();
        
        area = a * b;
        perimetro = ((2 * a) + (2 * b));

        System.out.println("El área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        

    }

}
