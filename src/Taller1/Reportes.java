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
        
        System.out.println("");
        System.out.println("");

          System.out.println("Ingrese su Direccion: ");
        obj1.Direccion = leer.dato();

        System.out.println("Ingrese su nombre: ");
        obj1.Nombre = leer.dato();
        
          System.out.println("Ingrese su CC: ");
        obj1.cc= leer.datoInt();

        
 
        System.out.println("Ingrese su celular: ");
        obj1.setCelular(leer.datoInt());

         System.out.println("Ingrese su cuenta: ");
        obj1.setCuenta(leer.datoInt());

        System.out.println("Ingrese su sueldo: ");
        obj1.setSueldo(leer.datoInt());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        
         System.out.println(obj1.Direccion);
        System.out.println(obj1.Nombre);
        System.out.println(obj1.cc);

        System.out.println(obj1.getCelular());
        System.out.println(obj1.getCuenta());
        System.out.println(obj1.getSueldo());
         
    }
}
