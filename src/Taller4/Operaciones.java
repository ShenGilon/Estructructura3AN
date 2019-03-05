package Taller4;

import java.util.Arrays;

public class Operaciones {

    public void ejercicio1() {

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
        
        System.out.println("");
        System.out.println("");
    }

    void ejercicio2() {

        int contPos = 0, contNeg = 0, j = 0, k = 0;
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
        j = 0;
        for (int i = positivos.length; i > 0; i--) {
            System.out.print(positivos[(i - 1)] + "\t");
            j++;
        }
        System.out.println("");

        System.out.println("Numeros negativos");
        for (int i = 0; i < negativos.length; i++) {
            System.out.print(negativos[i] + "\t");
        }

        System.out.println("");
        System.out.println("");
    }

    void ejercicio3() {
     int b, cont = 0;
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + " = ");
            numeros[i] = leer.datoInt();
            System.out.println("");
        }

        System.out.println("Que numero desea buscar?");
        b = leer.datoInt();
        for (int i = 0; i < numeros.length; i++) {
            if (b == numeros[i]) {
                cont++;

            }

        }
        System.out.println("El numero que busco se repite " +cont+ " veces");
        System.out.println("");
    }

    void ejercicio4() {

        int nElementos, j = 0;
        System.out.print("Ingrese el tamaño del vector = ");
        nElementos = leer.datoInt();

        int[] vector = new int[nElementos];
        int[] inverso = new int[nElementos];
        int[] suma = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print("Ingrese el numero en la posición " + i + " = ");
            vector[i] = leer.datoInt();
        }

        for (int i = nElementos; i > 0; i--) {
            inverso[j] = vector[(i - 1)];
            j++;
        }

        for (int i = 0; i < nElementos; i++) {
            suma[i] = (vector[i] + inverso[i]);
        }

        System.out.println("El vector es:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println("");
        System.out.println("El inverso es:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(inverso[i] + "\t");
        }
        System.out.println("");
        System.out.println("La suma del vector es:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(suma[i] + "\t");
        }

        System.out.println("");
        System.out.println("");
    }

}
