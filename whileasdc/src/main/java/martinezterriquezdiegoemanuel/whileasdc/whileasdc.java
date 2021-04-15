package martinezterriquezdiegoemanuel.whileasdc;
import java.util.Scanner;
public class whileasdc {
    public static void main(String[] args) {
        int sel;
        int i, f;
        Scanner leer = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("De que manera deseas realizar la cuenta");
        System.out.println("1.- Ascendente");
        System.out.println("2.- Descendente");
        System.out.println("____________________________________________________");
        sel = leer.nextInt();
        switch (sel) 
        {
            case 1:
                System.out.println("Ingresa el valor inicial del conteo");
                i = leer.nextInt();
                System.out.println("Ingresa el valor final del conteo");
                f = leer.nextInt();
                while (i <= f)
                {
                    System.out.println("Número : " + i);
                    i++;
                }
                break;
            case 2: 
                System.out.println("Ingresa el valor inicial del conteo");
                i = leer.nextInt();
                System.out.println("Ingresa el valor final del conteo");
                f = leer.nextInt();
                while (i >= f)
                {
                    System.out.println("Número : " + i);
                    i--;
                }
                break;
            default:
                System.out.println("El valor es incorrecto");
                break;
        }
    }   
}
