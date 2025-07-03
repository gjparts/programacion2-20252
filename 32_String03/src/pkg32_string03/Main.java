package pkg32_string03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa que primero capture un entero y luego capture
        un String y almacene cada uno en una variable.
        Luego el programa va a imprimir dicho String la cantidad de veces
        segun el entero que capturaron. Ejm:
        
        Digite un entero: 4
        Digite un String: Agua
        Resultado:
        Agua
        Agua
        Agua
        Agua*/
        int numero;
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        numero = s.nextInt();
        
        /*cuando se viene de leer un valor cuyo tipo de dato es primitivo
        y luego se quiere leer un String por medio de un inputStream como
        lo es System.in; entonces el programa crashea porque el buffer de
        entrada se lleno y el lenguaje no lo vacio.
        Solucion, vaciemos el buffer manualmente:*/
        s.nextLine();
        
        System.out.print("Ingrese un String: ");
        str = s.nextLine();
        for(int i = 1; i <= numero; i++){
            System.out.println(str);
        } 
    }    
}
