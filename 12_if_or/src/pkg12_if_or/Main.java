package pkg12_if_or;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Operador Logico OR
        Devuelve true si se cumple al menos una expresion
        de comparacion entre dos o mas expresiones.
        -> en JAVA y C++ se utiliza dos barras || (caracter 124)
        ejemplo:
        Haga un programa que pregunte el mes y el año como numeros enteros.
        El programa debe imprimir la cantidad de dias que tiene el mes/año
        digitados. El mes debe de ser un numero entre 1 y 12 de lo contrario
        no se aceptará.*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Digite el mes: ");
        m = s.nextInt();
        System.out.print("Digite el año: ");
        a = s.nextInt();
        if( m >= 1 && m <= 12 ){
            if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
                System.out.println("Mes tiene 31 dias");
            if( m == 4 || m == 6 || m == 9 || m == 11 )
                System.out.println("Mes tiene 30 dias");
            if( m == 2 ){
                if( a%4 == 0 ) //si el año el multiplo de 4...
                    System.out.println("Mes tiene 29 dias");
                else
                    System.out.println("Mes tiene 28 dias");
            }
        }
        else
            System.out.println("Mes no valido");
    }    
}
