// PROGRAMA 2 QUE LEE UNA LETRA DESDE EL TECLADO Y DICE SI ES MAYÚSCULA A NO.
//Martinez Terriquez Diego Emanuel

package martinezterriquezdiego.letra2;


import java.io.IOException;

public class letra2 {

    public static void main(String[] args) throws IOException {
        char caracter;
        System.out.print("Pulsa una LETRA: ");
        caracter = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(caracter)) //utilizamos el método isUpperCase de la clase Character
        {
            System.out.println( caracter + " es MAYÚSCULA");
        } 
        else {
            System.out.println(caracter + " es MINÚSCULA");
        }
    }
}


