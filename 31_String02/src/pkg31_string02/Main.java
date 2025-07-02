package pkg31_string02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Capturar un String en la consola usando Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un String: ");
        String str = s.nextLine();
        System.out.println("String leido: "+str);
        System.out.println("Longitud: "+str.length());
        System.out.println("En mayusculas: "+str.toUpperCase());
        System.out.println("En minusculas: "+str.toLowerCase());
        System.out.println("Sin relleno: "+str.trim());
        System.out.println("Longitud sin relleno: "+str.trim().length());
        /*Ejercicio: haga una copia del String recien leido en una nueva
        variable String; pero van a reemplazar la letra A por un 4 y la letra
        I por un 1, ignorando las mayusc./minusc. sin usar el metodo replace.
        Imprima el contenido de la nueva variable. ejemplo:
        Digite un String: GallinA
        Resultado: G4ll1n4*/
        //forma 1 (ignorar mayusc./minusc sin usar metodos):
        String copia = "";
        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) == 'i' || str.charAt(i) == 'I' )
                copia = copia + '1';
            else{
                if( str.charAt(i) == 'a' || str.charAt(i) == 'A' )
                    copia = copia + '4';
                else
                    copia = copia + str.charAt(i);
            }
        }
        System.out.println("Resultado: "+copia);
        
        //forma 2 (ignorar mayusc./minusc usando metodos):
        copia = "";
        for(int i = 0; i < str.length(); i++){
            if( str.toLowerCase().charAt(i) == 'i' )
                copia = copia + '1';
            else{
                if( str.toLowerCase().charAt(i) == 'a' )
                    copia = copia + '4';
                else
                    copia = copia + str.charAt(i);
            }
        }
        System.out.println("Resultado: "+copia);
    }    
}
