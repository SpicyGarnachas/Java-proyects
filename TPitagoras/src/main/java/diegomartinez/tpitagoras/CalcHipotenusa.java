//Ejercicio 3.- Programa que lee por teclado el valor del radio de una
//circunferencia, y a continuación calcula la longitud y el área de la
//circunferencia, mostrando los resultados a la salida.
//Martinez Terriquez Diego Emanuel
package diegomartinez.tpitagoras;
import java.util.Scanner;

public class CalcHipotenusa {

    public static void main(String[] args) {
        // TODO code application logic here
        double cateto1, cateto2, hipotenusa;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor del Primer Cateto: ");
        cateto1 = entrada.nextDouble();
        System.out.println("Introduce el valor del Segundo Cateto: ");
        cateto2 = entrada.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
        System.out.println("La HIPOTENUSA es: " + hipotenusa);
        System.out.println("");
        System.out.print("La HIPOTENUSA es: ");System.out.printf("%.4f %n",hipotenusa);
    }
}
