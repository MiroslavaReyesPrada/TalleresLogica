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
public class Banco {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int saldo = 1600000;
        int opc;
        int enviarDinero;
        int donacion;
        int clave = 1234;
        int claveAcceso = 0;
        int claveAcceso2 = 0;
        boolean bloqueo = false;

        do {

            do {

                System.out.println("Desea consultar su saldo, digite 1");
                System.out.println("Desea realizar tranferencia, digite 2");
                System.out.println("Desea cambiar su clave, digite 3");
                System.out.println("Desea bloquear producto, digite 4");
                System.out.println("Desea realizar donación, digite 5");
                System.out.println("Desea salir del menu, digite 6");
                System.out.println("Seleccione una opción");

                opc = sc.nextInt();

            } while (opc < 1 || opc > 6);
            if (opc != 6) {
                do {
                    System.out.println("Digite su clave");
                    claveAcceso = sc.nextInt();
                } while (claveAcceso < 1000 || claveAcceso > 9999);
            }
            if (clave == claveAcceso && !bloqueo) {
                switch (opc) {

                    case 1:
                        System.out.println("Usted selecciono consultar su saldo");
                        System.out.println("Su saldo es: " + saldo + "\n");
                        break;
                    case 2:
                        System.out.println("Usted selecciono realizar transferencia");
                        do {
                            System.out.print("Digite el valor a transferir");
                            enviarDinero = sc.nextInt();
                        } while (enviarDinero < 1);

                        if (enviarDinero < saldo) {
                            saldo -= enviarDinero;
                            System.out.println("\nLa operación fue Exitosa\n");
                        } else {
                            System.out.println("\nLa operación no se puede realizar. Consulte su saldo o ingrese un valor valido\n");
                        }
                        break;
                    case 3:
                        do {
                            System.out.println("Ingrese su nueva clave:");
                            claveAcceso = sc.nextInt();
                        } while (claveAcceso < 1000 || claveAcceso > 9999);
                        do {
                            System.out.println("Confirme su nueva clave");
                            claveAcceso2 = sc.nextInt();
                        } while (claveAcceso2 < 1000 || claveAcceso2 > 9999);
                        if (claveAcceso == claveAcceso2) {
                            clave = claveAcceso;
                            System.out.println("Su claves se cambio con exito");
                        } else {
                            System.out.println("Las claves no coinciden ");
                        }
                        break;
                    case 4:
                        bloqueo = true;
                        System.out.println("Su cuenta ya se encuentra bloqueada");
                        break;

                    case 5:

                        System.out.println("Ingrese el valor de su donación");
                        donacion = sc.nextInt();

                        if (donacion < 1 || donacion > saldo) {

                            System.out.println("\nLa operación no se puede realizar. Consulte su saldo o ingrese un valor valido\n");
                        } else {
                            saldo -= donacion;
                            System.out.println("\nLa operación fue Exitosa\n");
                        }
                        break;

                    default:
                        System.out.println("Usted selecciono salir del menu");
                        break;

                }

            } else {
                if (bloqueo) {
                    System.out.println("Su cuenta esta bloqueada acerquese a la sucursal mas cercana");
                } else {
                    System.out.println("Su clave no es valida");
                }
            }

        } while (opc != 6);
    }

}
