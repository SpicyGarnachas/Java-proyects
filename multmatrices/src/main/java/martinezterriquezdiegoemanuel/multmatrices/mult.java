package martinezterriquezdiegoemanuel.multmatrices;

import java.util.Arrays;
import java.util.Scanner;
public class mult {
    public static void main(String[] args) {
    int m1[][];
    m1 = new int[4][4];
    int m2[][];
    m2 = new int[4][4];
    int res[][];
    res = new int[4][4];
    int valor;
    Scanner leer = new Scanner (System.in);
    System.out.println("CAPTURA DE LA MATRIZ #1 \n ");
    for (int i = 0; i < m1.length; i++)
    {
        for (int j=0; j < m1[i].length; j++)
        {
            System.out.print("Elemento: " + "[" + i + "," + j + "] : ");
            valor = leer.nextInt();
            m1[i][j] = valor;
        }
        System.out.print("Fila " + (i + 1)+ " : ");
        System.out.println(Arrays.toString(m1[i]));
        System.out.println("");
    }
    System.out.println("CAPTURA DE LA MATRIZ #2 \n ");
    for (int i = 0; i < m2.length; i++)
    {
        for (int j=0; j < m2[i].length; j++)
        {
            System.out.print("Elemento: " + "[" + i + "," + j + "] : ");
            valor = leer.nextInt();
            m2[i][j] = valor;
        }
        System.out.print("Fila " + (i + 1)+ " : ");
        System.out.println(Arrays.toString(m2[i]));
        System.out.println("");
    }
    
    for (int i = 0; i < m1.length; i++)
    {
        for (int j=0; j < m1[i].length; j++)
        {
            res[i][j] = m1[i][j] * m2[i][j];
        }
    }

    System.out.println("Resultado");
    for (int i = 0; i < res.length; i++)
    {
        for (int j=0; j < res[i].length; j++)
        {
            }
            System.out.print("Fila " + (i + 1)+ " : ");
            System.out.println(Arrays.toString(res[i]));
        }
    System.out.print("\n"); 
    }
    
    
    
}


