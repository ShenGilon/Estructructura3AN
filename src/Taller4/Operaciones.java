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
        int Num1, Num2, Num3;
      System.out.println("");
        System.out.println("");
        System.out.println("*******");
        System.out.println("MENOR A MAYOR");
        System.out.println("*******");
        
        System.out.println("Ingrese El Primer Numero");
        Num1=leer.datoInt();
        
         System.out.println("Ingrese El Segundo Numero");
        Num2=leer.datoInt();
        
         System.out.println("Ingrese El Tercer Numero");
        Num3=leer.datoInt();
        
        
           System.out.println("");
            System.out.println("RESULTADO");
        
        
        if (Num1 < Num2 && Num1 < Num3) {
            if (Num2 < Num3) {
                System.out.println(Num1 + " " + Num2 + " " + Num3 );
            } else {
                 System.out.println(Num1 + " " + Num3 + " " + Num2 );
            }
        }
        else if (Num2 < Num1 && Num2 < Num3) {
            if (Num1 < Num3) {
                System.out.println(Num2 + " " + Num1 + " " + Num3 );
            } else {
                 System.out.println(Num2 + " " + Num3 + " " + Num1 );
            }
        }  
       
        else if (Num3 < Num1 && Num3 < Num2) {
            if (Num3 < Num2) {
                System.out.println(Num3 + " " + Num1 + " " + Num3 );
            } else {
                 System.out.println(Num3 + " " + Num2 + " " + Num3 );
            }
        } 
          System.out.println("");
          System.out.println("");
    }

      
        
        
    void ejercicio3() {
       System.out.println("");
        System.out.println("");
        System.out.println("*******");
        System.out.println("PLACA DE AUTOS");
        System.out.println("*******");
            int ncarros = 0, carros, camarillo = 0, crosa = 0, croja = 0, cverde = 0, cazul = 0;
        System.out.println("Ingrese la cantidad de carros");
        ncarros = leer.datoInt();

        for (int i = 0; i < ncarros; i++) {
            System.out.println("Cual es el ultimo digito de las placas del carro numero " + (i + 1));
            carros = leer.datoInt();
            if (carros == 1 || carros == 2) {
                camarillo++;
            } else if (carros == 3 || carros == 4) {
                crosa++;
            } else if (carros == 5 || carros == 6) {
                croja++;
            } else if (carros == 7 || carros == 8) {
                cverde++;
            } else if (carros == 9 || carros == 0) {
                cazul++;
            }

        }
            System.out.println("");
            System.out.println("RESULTADO");
        
        System.out.println("Ingresaron " + camarillo + " Placas amarillas");
        System.out.println("Ingresaron " + crosa + " Placas rosas");
        System.out.println("Ingresaron " + croja + " Placas rojas");
        System.out.println("Ingresaron " + cverde + " Placas verdes");
        System.out.println("Ingresaron " + cazul + " Placas azules");
        
        System.out.println("");
        System.out.println("");
    }

}
