package Taller3;

public class Operaciones {

    public void ejercicio1() {

        System.out.println("");
        System.out.println("");
        System.out.println("*******");
        System.out.println("AJEDREZ");
        System.out.println("*******");
         int fila, col, f, c;
        System.out.println("Ingrese la fila");
        f = leer.datoInt();
        System.out.println("Ingrese la columna");
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
        System.out.println("");
        System.out.println("");
    }

    void ejercicio2() {
        System.out.println("Estoy en 2");
    }

    void ejercicio3() {
        System.out.println("Estoy en 3");
    }

}
