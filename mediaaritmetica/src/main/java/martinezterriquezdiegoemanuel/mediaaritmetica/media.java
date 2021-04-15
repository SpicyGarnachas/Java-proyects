package martinezterriquezdiegoemanuel.mediaaritmetica;

import java.util.Scanner;

public class media {
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
        for (int x=0;x<array.length;x++){
            sum += array[x];
        }
        int res = sum/array.length;
        System.out.println("La media es = " +res );
    }
}
