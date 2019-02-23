package Taller1;

/**
 * @author steward & ShenGilon
 */
public class EjercicioC {

    public static void main(String[] args) {
        int a, cant, act = 1, ant = 0, pos, acumI = 0, num, encontrado = 0, suma = 0;
        System.out.println("cantidad?");
        cant = leer.datoInt();
        System.out.println("numero a encontrar");
        num = leer.datoInt();

        System.out.println(act);
        for (a = 1; a < cant; a++) {
            pos = ant + act;
            ant = act;
            act = pos;
            System.out.println(act);
            if (act % 2 == 1) {
                acumI = acumI + act;
            }
            if (num == act) {
                encontrado = 8;
            }
            
            suma = ant + act;
        }
        System.out.println("los impares suman " + acumI + 1);
        if (encontrado == 8) {
            System.out.println("El número " + num + " sí esta");
        } else {
            System.out.println("El número " + num + " no esta");
        }
        
        System.out.println("La suma de todos los números es " + suma);
    }

}
