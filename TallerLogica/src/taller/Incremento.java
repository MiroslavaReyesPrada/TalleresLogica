/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author ingmi
 */
public class Incremento {

    public static void main(String[] args) {

        int variablePoder = 0;
        int variableVida = 10;
        while (variableVida != 0) {
            int ramd = (int) (Math.random() * (10 - 1)) + 1;

            if (ramd == 5) {
                ++variablePoder;
            } else if (ramd == 3) {
                --variableVida;
            }
            System.out.println("numero Ramdom " + ramd);
        }
        System.out.println("su poder final es  " + variablePoder);
    }
}
