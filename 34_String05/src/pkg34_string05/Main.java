package pkg34_string05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Leer un String y luego lo van a imprimir;
        pero dejando tres espacios entre cada caracter
        sin afectar al String original.

        ->  Tambien van a imprimir cuantas veces
            se encontró la letra E dentro del String leido,
            ignorando mayusc./minusc.*/
        Scanner s = new Scanner(System.in);
        System.out.print("digite un String: ");
        String str = s.nextLine();
        int contador = 0;
        for( int i = 0; i < str.length(); i++ ){
            //imprimir cada char de String dejando tres espacios
            System.out.print( str.charAt(i)+"   " );
            if( str.toLowerCase().charAt(i) == 'e' ) contador++;
        }
        System.out.println();
        System.out.println("Letra E se encontro "+contador+" veces.");
    }    
}
