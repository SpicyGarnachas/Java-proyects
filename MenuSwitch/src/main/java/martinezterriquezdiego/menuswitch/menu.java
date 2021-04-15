package martinezterriquezdiego.menuswitch;

import java.util.Scanner;
public class menu {
    public static void main(String[] args){
        int opcion ,var1 , var2, res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("   ______      __           __          __                        ");
        System.out.println("  / ____/___ _/ /______  __/ /___ _____/ /___  _________ _        ");
        System.out.println(" / /   / __ `/ / ___/ / / / / __ `/ __  / __ \\/ ___/ __ `/       ");
        System.out.println("/ /___/ /_/ / / /__/ /_/ / / /_/ / /_/ / /_/ / /  / /_/ /         ");
        System.out.println("\\____/\\__,_/_/\\___/\\__,_/_/\\__,_/\\__,_/\\____/_/   \\__,_/  ");
        System.out.println("                                                                  ");
        System.out.println("____________________________________________________");
        System.out.println("Selecciona una operación");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("5.- Salir");
        System.out.println("____________________________________________________");
        System.out.println("-");
        System.out.flush();
        opcion = scanner.nextInt();  
	switch (opcion)
        {
            case 1:
                System.out.println("Has seleccionado la opcion 1.- Suma");
                System.out.println("Introduce el primer numero");
                var1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                var2 = scanner.nextInt();
                res = var1 + var2;
                System.out.println("El resultado es = " + res);
		break;
            case 2:
                System.out.println("Has seleccionado la opcion 2.- Resta");
                System.out.println("Introduce el primer numero");
                var1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                var2 = scanner.nextInt();
                res = var1 - var2;
                System.out.println("El resultado es = " + res);
		break;
            case 3:
                System.out.println("Has seleccionado la opcion 3.- Multiplicación");
                System.out.println("Introduce el primer numero");
                var1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                var2 = scanner.nextInt();
                res = var1 * var2;
                System.out.println("El resultado es = " + res);
		break;
            case 4:
                System.out.println("Has seleccionado la opcion 4.- División");
                System.out.println("Introduce el primer numero");
                var1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                var2 = scanner.nextInt();
                if(var1 == 0 & var2 == 0 || var1 == 0 || var2 == 0){
                    System.out.println("No se pueden dividir ceros");
                }
                else{
                    res = var1 / var2;
                    System.out.println("El resultado es = " + res);
                }
		break;
            case 5:
                System.exit(0); 
		break;
            default:
		System.out.println("Opción invalida");
                System.exit(0); 
	}
    }
}
