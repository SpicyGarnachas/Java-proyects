package martinezterriquezdiegoemanuel.examen001;
import java.util.Arrays;
import java.util.Scanner;
public class examen001 {
    public static void main(String[] args) {
        boolean condicion = true;
        while(condicion == true)
        {
            int m, n, valor, selección;
            int m1[][];
            int res[][] = null;
            int sumafilas;
            
            int sumacolumnas;
            String diagonalp = "";
            
            Scanner leer = new Scanner (System.in);
            System.out.println("Ingresa el valor m de la matriz");
            m = leer.nextInt();
            
            System.out.println("Ingresa el valor n de la matriz");
            n = leer.nextInt();
            
            if (n == m){
                System.out.println("La matriz si es cuadrada");
                m1 = new int[n][m];
                int[] diagonalPrincipal = new int[m1.length];
                
               System.out.println("CAPTURA DE LA MATRIZ #1 \n ");
               for (int i = 0; i < m1.length; i++)
               {
                   for (int j=0; j < m1[i].length; j++)
                   {
                       System.out.println("Elemento: " + "[" + i + "," + j + "] : ");
                       valor = leer.nextInt();
                       m1[i][j] = valor;
                   }
                   System.out.print("Fila " + (i + 1)+ " : ");
                   System.out.println(Arrays.toString(m1[i]));
                   System.out.println("");
               }
                for(int i=0;i<m1.length;i++){
                    for(int j=0;j<m1[i].length;j++){
                        if(i==j){
                            diagonalPrincipal[i] = m1[i][j];
                        }
                    }
                }
                for(int i=0;i<m1.length;i++){
                    diagonalp = diagonalp + diagonalPrincipal[i] + " "; 
                }
                System.out.println("La diagonal principal es : " + diagonalp);
                //filas
                for (int i = 0; i < m1.length; i++)
                {
                    sumafilas = 0;
                    for (int j=0; j < m1[i].length; j++)
                    {
                        sumafilas = sumafilas  + m1[i][j];
                    }
                    System.out.println("La suma de la fila" + " " + i + 1+ " es =" + sumafilas);
                }
                //columnas
                for (int i = 0; i < m1[0].length; i++)
                {
                    sumacolumnas = 0;
                    for (int j=0; j < m1.length; j++)
                    {
                        sumacolumnas = sumacolumnas  + m1[j][i]; 
                    }
                    System.out.println("La suma de la columna" + " " + i + 1+ " es =" + sumacolumnas);
                } 
            }
            else{
                System.out.println("La matriz no es cuadrada");
            }
            System.out.println("Deseas introducir otros datos?");
            System.out.println("(1)- no (Otro numero)- si");
            selección = leer.nextInt();

            if(selección == 1){
                condicion = false;
            }    
        }    
    }
}
