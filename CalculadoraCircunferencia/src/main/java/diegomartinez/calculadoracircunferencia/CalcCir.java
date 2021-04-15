//Ejercicio 2.- Programa que lee por teclado el valor del radio de una
//circunferencia, y a continuación calcula la longitud y el área de la
//circunferencia, mostrando los resultados a la salida.
//Martinez Terriquez Diego Emanuel
package diegomartinez.calculadoracircunferencia;
import java.util.Scanner;

public class CalcCir {

    public static void main(String[] args) {
        
        double radio, longitud, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el Radio de la Circunferencia: ");
        radio = entrada.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La Longitud de la circunferencia es: " + longitud);
        System.out.println("");
        System.out.print("La Longitud de la circunferencia es:");System.out.printf("%.4f %n", longitud);
        System.out.println("");
        System.out.println("El Área de la circunferencia es: " + area);
    }
}
