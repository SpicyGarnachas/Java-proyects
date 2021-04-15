package martinezterriquezdiegoemanuel.leercadena;

import java.util.Scanner;

public class cadena {
    public static void main(String[] args) {
        int rep = 0;
        int sel ;
        Scanner leer = new Scanner(System.in);
        while(rep == 0 ){
            cadena();
            System.out.println("Deseas repetir?");
            System.out.println("Si (Pulsa otro numero)");
            System.out.println("No (1)");
            sel = leer.nextInt();
            if (sel == 1){
                rep++;
            }
        }
    }
    
    public static int cadena(){
        Scanner leer = new Scanner(System.in);
        int espacios = 0;
        String str;
        System.out.println("Introduce una palabra");
        str = leer.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' '){
                espacios = espacios + 1;
            }
        }
        if(espacios == 0)
        {
            for (int i=0; i < str.length(); i++)
            {
                System.out.println(str.charAt(i));
            } 
        }
        else
        {
            System.out.println("La palabra no debe tener espacios");
        }
        return 0;
    } 
}
