package Taller4;

import Taller3.leer;

public class AjedrezPunto_1 {

    public static void main(String[] args) {
        int fila, col, f, c;
        System.out.println("ingrese fila");
        f = leer.datoInt();
        System.out.println("Ingrese columna");
        c = leer.datoInt();
        if (f >= 1 && f <= 8 && c >= 1 && c <= 8) {
            for (fila = 1; fila <= 8; fila++) {
                for (col = 1; col <= 8; col++) {
                    if (f == fila && c == col) {
                        System.out.print(" Q ");
                    } else if (col == fila) {
                        System.out.print(" Y ");
                    }else if (col + fila == 9) {
                        System.out.print(" Y ");
                    } else if ((col + fila) % 2 == 0) {
                        System.out.print(" B ");
                    } else {
                        System.out.print(" N ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Error");
        }
    }
}
