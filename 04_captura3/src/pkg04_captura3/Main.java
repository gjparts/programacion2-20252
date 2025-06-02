/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_captura3;

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
        double a,b,c,d;
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        System.out.print("d: ");
        d = s.nextDouble();
        //relizar los calculos
        //forma 1: un solo calculo en la salida
        System.out.println("Resultado: "+((Math.sqrt(a+Math.pow(b,3)))/(Math.pow(c,1.0/3.0)*d+5)-8));
        //forma 2: separar el problema en partes
        double numerador, denominador;
        numerador = Math.sqrt(a+Math.pow(b,3));
        denominador = Math.pow(c,1.0/3.0)*d+5;
        System.out.println("Resultado: "+(numerador/denominador-8));
    }
    
}
