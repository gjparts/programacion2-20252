/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02_captura1;

/**
 *
 * @author Gerardo
 */
//aqui se hace la importacion de Clases:
import java.util.Scanner; //Clase para poder leer datos desde un origen
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar un nuevo objeto de clase Scanner
        Scanner lector = new Scanner(System.in);
        //programa que suma dos numeros
        int n1, n2;
        System.out.print("Digite un numero entero: ");
        n1 = lector.nextInt();
        System.out.print("Digite otro numero entero: ");
        n2 = lector.nextInt();
        System.out.println("La suma de los dos numeros es: "+(n1+n2));
    }
    
}
