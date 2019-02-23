/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

/**
 *
 * @author steward & ShenGilon
 */
public class EjercicioC {

    public static void main(String[] args) {
        for (int a = 150; a >= 10; a -= 10) {

            if (a == 140 || a == 120 || a == 80 || a == 20) a -= 10;
            
            if (a == 60) a -= 20;
            
            System.out.print(a + " ");
            
            if (a > 10) System.out.print("- ");

        }

    }

}
