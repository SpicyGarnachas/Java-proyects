// PROGRAMA 3 QUE LEE UN NÚMERO Y, POR MEDIO DE RESIDUO ENTRE 2, CALCULA SI ES PAR O
//Martinez Terriquez Diego Emanuel

package martinezterriquezdiego.numpar;

import java.util.Scanner;
public class numpar {

    public static void main(String[] args) {
        // TODO code application logic here public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Pulsa un número ENTERO: ");

        numero = entrada.nextInt();
        if(numero % 2 == 0)
            System.out.println("El número tecleado es PAR");
        else
            System.out.println("El número tecleado es IMPAR");
    }
}
