//Ejercicio 4.1
//Calcular area de un trapecio
//Martinez Terriquez Diego Emanuel
package diegomartinez.areatrapecio;

import java.util.Scanner;

public class calcArea {
    public static void main(String[] args) {
        double bMenor, bMayor, altura, suma, div, res;
        Scanner varIn = new Scanner(System.in);
        System.out.println("Introduce la base menor:");
        bMenor = varIn.nextDouble();
        System.out.println("Introduce la base mayor:");
        bMayor = varIn.nextDouble();
        System.out.println("Introduce la altura:");
        altura = varIn.nextDouble();
        suma = bMenor + bMayor;
        div = suma/2;
        res = div * altura;
        System.out.println("El area del trapecio es : " + res);
    }
}
