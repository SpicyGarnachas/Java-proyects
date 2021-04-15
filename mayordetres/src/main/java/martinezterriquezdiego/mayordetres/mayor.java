
package martinezterriquezdiego.mayordetres;
import java.util.Scanner;

public class mayor {
    public static void main(String[] args) {
        int v1, v2, v3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce el primer numero");
        v1 = scanner.nextInt();
        
        System.out.println("introduce el segundo numero");
        v2 = scanner.nextInt();
        
        System.out.println("introduce el tercer numero");
        v3 = scanner.nextInt();
        
        if(v1 > v2 && v1 > v3){
            System.out.println("el primer numero es el mayor");
                    }
        else if (v2 > v1 && v2 > v3){
            System.out.println("el segundo numero es el mayor");
        }
        else if(v3 > v1 && v3 > v2){
            System.out.println("el tercer numero es el mayor");
        }
        else if(v1 == v2 && v2 == v3){
            System.out.println("todos los numeros son iguales");
        }
    }
}
