package Taller4;

public class Taller4Punto3 {

    public static void main(String[] args) {
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
    }
}
