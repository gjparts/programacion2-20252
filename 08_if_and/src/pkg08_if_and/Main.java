package pkg08_if_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Operador logico AND
        Hace obligatrio el cumplimiento de una o varias condiciones.
        En JAVA y C++ se le representa con un doble ampersand: &&
        ejemplo:
        Solicite al usuario que digite los valores para a,b c.
        Si a es mayor a 7 Y b es menor a 12 Y c es igual a 11 entonces
        mostrar el mensaje: COMBINACION CORRECTA, sino mostrar: ACCESO NO VALIDO.
        -> resolverlo usando operadores logicos.*/
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.print("a: ");
        a = s.nextInt();
        System.out.print("b: ");
        b = s.nextInt();
        System.out.print("c: ");
        c = s.nextInt();
        if( a > 7 && b < 12 && c == 11 )
            System.out.println("COMBINACION CORRECTA.");
        else
            System.out.println("ACCESO NO VALIDO.");
    }    
}
