//Ejemplo If
//Martinez Terriquez Diego Emanuel
package martinezterriquezdiego.ejemploif;

// PROGRAMA EJEMPLO DE LA INSTRUCIÓN if

import java.util.Scanner;
public class ifejemplo {
    public static void main(String[] args) {
        // code application logic here
        int numero;
        Scanner leer = new Scanner (System.in);
        System.out.println("Pulsa un número: ");
        numero = leer.nextInt();
        if (numero > 0)
        {
            System.out.println("El número es POSITIVO");
        }
        else
        {
            System.out.println("El número es NEGATIVO");
        }
    }
}