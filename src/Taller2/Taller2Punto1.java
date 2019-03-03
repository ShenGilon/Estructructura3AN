package Taller2;

/**
 *
 * @author steward & ShenGilon
 */
public class Taller2Punto1 {

  public static void main(String[] args) {
        for (int a = 150; a >= 10; a -= 10) {

            if (a == 140 || a == 120 || a == 80 || a == 20) a -= 10;
            
            if (a == 60) a -= 20;
            
            System.out.print(a + " ");
            
            if (a > 10) System.out.print("- ");
        }
    }
    
}
