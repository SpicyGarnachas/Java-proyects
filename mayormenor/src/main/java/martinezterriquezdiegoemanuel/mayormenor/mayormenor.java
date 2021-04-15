package martinezterriquezdiegoemanuel.mayormenor;
import java.util.Scanner;
public class mayormenor {
    public static void main(String[] args) {
        int varin, sum = 0;
        int array[];
        Scanner varIn = new Scanner(System.in);
        System.out.println("Introduce la longitud del vector");
        varin = varIn.nextInt();
        array = new int[varin];
        for (int x=0;x<array.length;x++){
            System.out.println("Introduce el valor del vector" + "["+ x + "]");
            array[x] = varIn.nextInt();
        }
        int mayor, menor;
        mayor = menor = array [0];
        for (int i = 0; i < array.length; i++) {
            if(array [i] > mayor) {
                mayor = array[i];
            }
            if(array[i]<menor) {
                menor = array[i];
            }
        }
        System.out.println("El valor mayor es: "+mayor);
        System.out.println("El valor menor es: "+menor);
    }
}
