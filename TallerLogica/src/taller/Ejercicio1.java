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
public class Ejercicio1 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
    //primer punto
    
    double resultado;
    double multi= 8*5;
    double divi= 6/3;
    
    resultado= 3+multi-divi;
    System.out.println("la operación a realizar es:  (3+8*5-6/3)");
    System.out.println("El resultado de la operacón es: " + resultado);
    System.out.println("-----------------------------");
    
    //2.5*2*3-4/2+8
    
    double mult1;
    double div;
    double operacion1;
    
    mult1= 2.5*2*3;
    div=4/2;
    operacion1= mult1-div+8;
    System.out.println("la operación a realizar es:  (2.5*2*3-4/2+8)");
    
    System.out.println("El resultado de la operación es: " +
            operacion1);
    System.out.println("-----------------------------");
    
    //2*(6-2.5)/3
    
    double difer = (6-2.5);
    double opr = difer/3;
    double operacion2;
    
    operacion2 = opr*2;
    System.out.println("la operación a realizar es:  (2*(6-2.5)/3)");
    System.out.println("El resultdo de la operación es: " + operacion2);
    System.out.println("-----------------------------");
    
    //25>18
    
    boolean mayor=25>18;
    System.out.println("25>18");
    System.out.println("¿Si es mayor?: " +  mayor);
    System.out.println("-----------------------------");
    
    //3+2.5*4/3 != 4*5.2-3.8
    
    double dato=(3+2.5*4/3);
    double dato1= (4*5.2-3.8);
            
    boolean resp= dato!=dato1;
    System.out.println("Dato es igual: (3+2.5*4/3)");
    System.out.println("Dato1 es igual: (4*5.2-3.8)");
    System.out.println("¿dato es diferente de dato 1?: " + resp);
    System.out.println("-----------------------------");
    
    //(8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)
    
    double opera =((8.5/3.2)+(6.5-(2.3*5/6)));
    double oper2 = ((51/4)+2);
    boolean resp1 = opera >= 15.6;
    boolean resp2 = 21.4<oper2;
    System.out.println("la operación a realizar es:  ((8.5/3.2)+(6.5-(2.3*5/6)))");
    System.out.println("¿la operación realizada es mayor o igual a 15.8?: " + resp1);
    System.out.println("la operación a realizar es:  (21.4<(81/4)+2)");
    System.out.println("¿la operación realizada es mayor que 21.4?: " + resp2);
    
  
    


    
    
    
    
            
    
    }
    
}
