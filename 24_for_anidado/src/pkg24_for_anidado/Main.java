package pkg24_for_anidado;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Estructura de repeticion anidada (nested)
        Es aquella donde hay una estructura dentro de otra, y normalmente
        se usan donde se necesite ejecutar una serie de iteraciones secundarias
        por cada iteracion primaria.
        Ejemplo: haga un programa que solicite al usuario el alto y el ancho
        de un rectangulo, como numeros enteros.
        Entonces imprima un rectangulo hecho de asteriscos segun el alto
        y ancho proporcionados.*/
        Scanner s = new Scanner(System.in);
        int alto, ancho;
        System.out.print("Alto: ");
        alto = s.nextInt();
        System.out.print("Ancho: ");
        ancho = s.nextInt();
        for( int i = 1; i <= alto; i++ ){
            for( int j = 1; j <= ancho; j++ ){
                System.out.print("*");
            }
            System.out.println(); //pasar a la linea siguiente
        }
    }    
}
