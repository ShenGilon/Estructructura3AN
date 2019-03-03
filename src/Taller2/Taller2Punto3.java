package Taller2;

/**
 *
 * @author steward & ShenGilon
 */
public class Taller2Punto3 {

    public static void main(String[] args) {

        int sueldo, antiguedad, utilidad = 0;

        System.out.println("Cual es el sueldo del empleado");
        sueldo = leer.datoInt();

        System.out.println("Cual es la antiguedad en años (si es menos de un año, digite 0)");
        antiguedad = leer.datoInt();

        switch (antiguedad) {
            case 0:
                utilidad = (int) (sueldo * 0.03);
                break;
            case 1:
                utilidad = (int) (sueldo * 0.03);
                break;
            case 2:
                utilidad = (int) (sueldo * 0.12);
                break;
            case 3:
                utilidad = (int) (sueldo * 0.12);
                break;
            case 4:
                utilidad = (int) (sueldo * 0.12);
                break;
            case 5:
                utilidad = (int) (sueldo * 0.18);
                break;
            case 6:
                utilidad = (int) (sueldo * 0.18);
                break;
            case 7:
                utilidad = (int) (sueldo * 0.18);
                break;
            case 8:
                utilidad = (int) (sueldo * 0.18);
                break;
            case 9:
                utilidad = (int) (sueldo * 0.18);
                break;
            case 10:
                utilidad = (int) (sueldo * 0.25);
                break;
            default:
                utilidad = (int) (sueldo * 0.25);
                break;
        }

        System.out.println("La utilidad es " + utilidad);

    }
}
