//Ejercicio 1.- Programa que lee una cantidad dada en Grados Centígrados, calcula
//su equivalente en Grados Fahrenheit y despliega el resultado.
//Martinez Terriquez Diego Emanuel
package diegomartinez.centigradosafahrenheit;
import java.util.Scanner;

public class CalcGrad {

    public static void main(String[] args) {
        double gCen, gFar;
        Scanner varIn = new Scanner(System.in);
        System.out.println("Introduce la cantidad en grados centigrados:");
        gCen = varIn.nextDouble();
        gFar = 32 + (9 * gCen / 5);
        System.out.println(gCen + " °C = " + gFar + " °F");
    }
}
