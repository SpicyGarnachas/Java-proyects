//PROGRAMA 1 QUE LEE UNA LETRA DESDE EL TECLADO Y DICE SI ES MAYÚSCULA A NO.
//Martinez Terriquez Diego Emanuel
package martinezterriquezdiego.letra;

import java.util.Scanner;

public class letra {
    public static void main(String[] args) {
        char caracter;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Pulsa una LETRA: ");
        caracter = entrada.next().charAt(0); //CON ESTA INSTRUCCIÓN SOLO CAPTURA UN CARACTER
        if(caracter>='A' && caracter <='Z')
            System.out.println( caracter + " es MAYÚSCULA");
        else
            System.out.println(caracter + " NO es MAYÚSCULA");
    }
}