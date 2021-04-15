//2.- SEGUNDO PROGRAMA EN JAVA, LECTURA DE DATOS
//Martinez Terriquez Diego Emanuel
package diegomartinez.lecturadedatos;
import java.util.Scanner;
public class LeeDatos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Escribe tu nombre: ");
        nombre = entrada.next();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Hola "+ nombre);
        System.out.println("Tienes " + edad + " Años");
    }
}
