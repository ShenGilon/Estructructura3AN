package Taller3;

public class Menu {

    public static void main(String[] args) {

        int opcion, ciclo = 6, intentos = 2;

        Operaciones op = new Operaciones();

        while (ciclo == 6) {
            System.out.println("Menu");
            System.out.println("1. ejercicio1");
            System.out.println("2. ejercicio1");
            System.out.println("3. ejercicio1");
            System.out.println("4. salir");
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
