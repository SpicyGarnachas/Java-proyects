//Programa que calcula si el primer numero es multiplo del segundo
//Martinez Terriquez Diego Emanuel
package martinezterriquezdiego.multiplo;

import java.util.Scanner;

public class multiplo {
   public static void main(String[] args) {
        double var1, var2;
        Scanner varIn = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        var1 = varIn.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        var2 = varIn.nextDouble();
        
        
        if (var1 % var2 == 0){
            System.out.println("el numero 1 es multiplo del numero 2");
            
        }
        else{
             System.out.println("el numero 1 no es multplo del numero 2");
        }
        
        

    }
    
}
