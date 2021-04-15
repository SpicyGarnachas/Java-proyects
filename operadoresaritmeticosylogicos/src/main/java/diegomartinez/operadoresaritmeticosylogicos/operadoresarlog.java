//4.- CUARTO PROGRAMA EN JAVA, OPERADORES ARITMETICOS Y LOGICOS
//Martinez Terriquez Diego Emanuel
package diegomartinez.operadoresaritmeticosylogicos;

public class operadoresarlog {
    public static void main(String[] args){
        // OPERADORES ARITMETICOS
        int num1, num2, num3, num4;
        int res;
        num1 = 250; num2 = 100; num3 = 25; num4 = 150;
        res= num1 + num4;
        System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + res);
        res = num2 - num3;
        System.out.println("El resultado de " + num2 + " - " + num3 + " es: " + res);
        res = num1 * num3;
        System.out.println("El resultado de " + num1 + " X " + num3 + " es: " + res);
        num1 = 195; num2 = 7;
        res = num1 / num2;
        System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + res);
        res = num1 % num2;
        System.out.println("El RESIDUO entre " + num1 + " y " + num2 + " es: " + res);
        
        
        // OPERADORES LÓGICOS
        //&& (AND) || (OR)
        boolean resbol = (6>3);
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = (8<2);
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = (8==8);
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = (8!=8);
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = ((8>2) && (9>4));
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = ((8<2) && (9>4));
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
        resbol = ((8>2) || (9>4));
        System.out.println("El Valor BOOLEANO de la variable es : " + resbol);
    }
}
