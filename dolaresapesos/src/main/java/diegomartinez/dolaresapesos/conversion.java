//Ejercicio 4.2
//Calcular el valor del dolar
//Martinez Terriquez Diego Emanuel
package diegomartinez.dolaresapesos;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        double equivalencia,pesos;
        Scanner varIn = new Scanner(System.in);

        System.out.println("Ingresa el valor del dólar en pesos: ");
        equivalencia = varIn.nextDouble();
        System.out.println("Ingresa la cantidad de pesos: ");
        pesos = varIn.nextDouble();
        double dolares = pesos / equivalencia;
        System.out.printf("el resultado es : "+ dolares+ " dolares");
    }
}
