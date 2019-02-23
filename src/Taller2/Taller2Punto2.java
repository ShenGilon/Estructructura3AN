/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

/**
 *
 * @author steward & ShenGilon
 */
public class Taller2Punto2 {

    public static void main(String[] args) {
        int cant, a, numero, acum4 = 0, acum5 = 0, acum6 = 0, salida = 4;
        System.out.println("Ingrese la cantidad de numeros");
        cant = leer.datoInt();

        for (a = 1; a <= cant; a++) {
            System.out.println("Ingrese un numero multiplos de 4, 5 o 6");
            numero = leer.datoInt();
            if (numero % 4 == 0 || numero % 5 == 0 || numero % 6 == 0) {

                if (numero % 4 == 0) {
                    acum4 += numero;
                }

                if (numero % 5 == 0) {
                    acum5 += numero;
                }

                if (numero % 6 == 0) {
                    acum6 += numero;
                }

            } else {
                salida--;
                System.out.println("clave invalida..le quedan " + salida + " intentos");

                if (salida == 0) {
                    break;
                }
            }
        }

        System.out.println("los multiplos de 4 suman " + acum4);
        System.out.println("los multiplos de 5 suman " + acum5);
        System.out.println("los multiplos de 6 suman " + acum6);
    }
}
