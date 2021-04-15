//Programa 5.1 Formula general
//Martinez Terriquez Diego Emanuel
package martinezterriquezdiego.formulageneral;

import java.util.Scanner;

/**
 *
 * @author DEMTPCMASTERRAIZ
 */
public class formulageneral {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner varIn = new Scanner(System.in);
        System.out.println("Introduce el coeficiente a:");
        a = varIn.nextDouble();
        
        System.out.println("Introduce el coeficiente b:");
        b = varIn.nextDouble();
        
        System.out.println("Introduce el coeficiente c:");
        c = varIn.nextDouble();
       
        d = Math.pow(b,2) - 4*a*c;
        
        x1 = (-b + Math.sqrt(d)) / 2*a;
        x2 = (-b - Math.sqrt(d)) / 2*a;
        
        System.out.println("el resultado es : x1 = " + x1 + ", x2 = " + x2);
        
    
    }
}
