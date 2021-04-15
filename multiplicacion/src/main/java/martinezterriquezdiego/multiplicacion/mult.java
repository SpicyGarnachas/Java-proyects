package martinezterriquezdiego.multiplicacion;

import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        int v1, v2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tabla deseas mostrar?");
        v1 = scanner.nextInt();
        if (v1 >= 1 && v1 <= 10){
            for(int i = 1; i <= 10; i = i + 1){
                v2 = i * v1;
                System.out.println(v1 + " * " +  i + " = " + v2);
            }
        }
        else{
            System.out.println("El numero esta fuera de rango");
        } 
    }
}
