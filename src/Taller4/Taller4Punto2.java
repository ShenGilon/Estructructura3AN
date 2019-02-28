package Taller4;

import java.util.Arrays;

public class Taller4Punto2 {

    public static void main(String[] args) {
        int contPos = 0, contNeg = 0, j = 0, k=0;
        int numeros[] = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + " = ");
            numeros[i] = leer.datoInt();
            System.out.println("");

            if (numeros[i] > 0) {
                contPos++;
            } else {
                contNeg++;
            }
        }

        int[] positivos = new int[contPos];
        int[] negativos = new int[contNeg];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos[j] = numeros[i];
                j++;
            } else {
                negativos[k] = numeros[i];
                k++;
            }
        }

        Arrays.sort(positivos);
        Arrays.sort(negativos);

        System.out.println("Numeros Positivos");
        j=0;
        for (int i = positivos.length; i > 0; i--) {
            System.out.print(positivos[(i - 1)] + "\t");
            j++;
        }
            System.out.println("");
        
        System.out.println("Numeros negativos");
        for (int i = 0; i < negativos.length; i++) {
            System.out.print(negativos[i] + "\t");
        }
    }
}
