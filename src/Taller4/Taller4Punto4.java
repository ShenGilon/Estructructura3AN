package Taller4;

/**
 *
 * @author steward & ShenGilon
 */
public class Taller4Punto4 {

    public static void main(String[] args) {

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
            System.out.print(vector[i]+"\t");
        }
            System.out.println("");
            System.out.println("El inverso es:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(inverso[i]+"\t");
        }
            System.out.println("");
            System.out.println("La suma del vector es:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(suma[i]+"\t");
        }

    }

}
