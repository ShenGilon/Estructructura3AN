package Taller1;

public class Reportes {

    public void Muestra() {
        Datos obj1 = new Datos();
        System.out.println(obj1.Direccion);
        System.out.println(obj1.Nombre);
        System.out.println(obj1.cc);

        System.out.println(obj1.getCelular());
        System.out.println(obj1.getCuenta());
        System.out.println(obj1.getSueldo());

        System.out.println("Ingrese su nombre: ");
        obj1.Nombre = leer.dato();

        System.out.println("Ingrese su celular: ");
        obj1.setCelular(leer.datoInt());

    }
}
