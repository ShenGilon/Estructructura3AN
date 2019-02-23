/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;

/**
 *
 * @author stewa
 */
public class Promedio {

    public static int prom() {
        int n, notas = 0, notaAlta = 0, notaBaja = 100, notasPromedio = 0;

        System.out.println("¿Cuantos estudiantes son?");
        n = leer.datoInt();

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la nota del estudiante" + i);
            notas = leer.datoInt();

            if (notas > notaAlta) notaAlta = notas;
            
            if (notas < notaBaja) notaBaja = notas;
            
            notasPromedio += notas;
            
        }
        notasPromedio /= n;
        
        System.out.println("El promedio es " + notasPromedio);
        
        System.out.println("La nota más alta es " + notaAlta);

        System.out.println("La nota más baja es " + notaBaja);

        return 0;
    }
}
