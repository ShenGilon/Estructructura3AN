package Taller4;

import java.util.Arrays;

/**
 *
 * @author steward & ShenGilon
 */
public class Taller4Punto1 {

    public static void main(String[] args) {

        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + " = ");
            numeros[i] = leer.datoInt();
            System.out.println("");

        }

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.print(numero + "\t");
        }

    }

}
