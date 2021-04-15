//Ejercicio 4.3
//Calcular el volumen de una esfera
//Martinez Terriquez Diego Emanuel
package diegomartinez.volumenesfera;
import java.util.Scanner;

public class CalcularVolumenEsfera {
    public static void main(String[] args) {
        double radio;
        Scanner varIn = new Scanner(System.in);
        System.out.println("Ingresa el radio de la esfera: ");
        radio = varIn.nextDouble();
        double radio3 = radio * radio * radio;
        double res = 1.3333 * 3.1416 * radio3;
        System.out.printf("el resultado es : " + res);
    }
}
