package martinezterriquezdiegoemanuel.examen002;
import java.util.Scanner;
import java.util.Random;
public class examen002 {
    public static void main(String[] args) {
        boolean condicion = true;
        while(condicion == true)
        {
            int selección;
            int vec[];
            int suma = 0;
            int numeroMayor = 0;
            int posicionm = 0;
            int numeroMenor = 1000;
            int posicionmn = 0;
            vec = new int[20];
            Random rand = new Random();
            Scanner leer = new Scanner (System.in);
            for (int i = 0; i < vec.length; i++)
            {
                vec[i] = rand.nextInt(101);
            }
            System.out.println("----------------------Datos del Vector-------------------");
            for (int i = 0; i < vec.length; i++)
            {
                System.out.println(vec[i]);
            }
            System.out.println("----------------------Datos del Vector-------------------");
            for (int x = 0; x < vec.length; x++) {
		suma = suma + vec[x];
            }
            float promedio = suma / vec.length;
            System.out.printf("El promedio es : " +  promedio + "\n");
            for (int x=1;x<vec.length;x++){
                if (vec[x]>numeroMayor) {
                    numeroMayor = vec[x];
                    posicionm = x;
                }                    
            }
            System.out.printf("El numero mayor es: " +  numeroMayor + " posicion : " +  posicionm + "\n");
            for (int x=1;x<vec.length;x++){
                if (vec[x]<numeroMenor) {
                    numeroMenor = vec[x];
                    posicionmn = x;
                }                    
            }
            System.out.printf("El numero menor es: " +  numeroMenor + " posicion : " +  posicionmn + "\n");
            System.out.printf("Nota: La posición empieza de 0 y termina hasta 19" + "\n");
            System.out.println("Deseas introducir otros datos?" + "\n");
            System.out.println("(1)- no (Otro numero)- si");
            selección = leer.nextInt();
            if(selección == 1){
                condicion = false;
            }    
        }    
    }
}
