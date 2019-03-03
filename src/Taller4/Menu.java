package Taller4;

/**
 *
 * @author steward & ShenGilon
 */

public class Menu {

    public static void main(String[] args) {

        int opcion, ciclo = 6, intentos = 2;

        Operaciones op = new Operaciones();

        while (ciclo == 6) {
            System.out.println("Menu");
            System.out.println("1.	Capturar datos en un vector e indicar cuál es el mayor y el menor número, de los valores introducidos");
            System.out.println("2.	Capturar datos en un vector e ingresar números positivos y negativos. Organizarlos, los positivos de mayor a menor y los negativos de menor a mayor.");
            System.out.println("3.	Capturar datos en un vector.  El programa debe permitir buscar un número determinado e indicar cuantas veces se repite en el vector.");
            System.out.println("4.	Capturar datos un vector, realizar una copia inversa y sumar los dos vectores");
            System.out.println("5.	Salir");
            System.out.println("Digite Opcion");

            opcion = leer.datoInt();

            switch (opcion) {
                case 1:
                    op.ejercicio1();
                    break;
                case 2:
                    op.ejercicio2();
                    break;
                            
                case 3:
                    op.ejercicio3();
                    break;
                case 4:
                    op.ejercicio4();
                    break;
                case 5:
                    System.out.println("El programa se cerro...");
                    ciclo = 15;
                    break;
                default:
                    System.out.println("Error le quedan " + intentos + " Intentos ");
                    intentos--;
                    if (intentos == -1) {
                        ciclo = 15;
                    }
            }

        }
    }
}
