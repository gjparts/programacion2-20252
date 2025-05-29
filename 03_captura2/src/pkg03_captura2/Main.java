/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_captura2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c;
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        //hay muchas forma de hacer el calculo
        //Forma 1:
        System.out.println("El resultado es: "+(a+b)/(a-c) );
        //Forma 2:
        double numerador = a+b, denominador = a-c;
        System.out.println("El resultado es: "+numerador/denominador);
        //Forma 3:
        double resultado = (a+b)/(a-c);
        System.out.println("El resultado es: "+resultado);
        //Forma 4:
        double r = numerador/denominador;
        System.out.println("El resultado es: "+r);
    }
    
}
