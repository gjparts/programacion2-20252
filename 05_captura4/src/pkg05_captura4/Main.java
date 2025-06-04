/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05_captura4;

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
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar. ejemplos:

        Digitar monto vendido: 15000
        El descuento es: 3000
        El valor a pagar es: 12000

        otro ejemplo:
        Digitar monto vendido: 10000
        El descuento es: 0
        El valor a pagar es: 10000

        otro ejemplo:
        Digitar monto vendido: 5000
        El descuento es: 0
        El valor a pagar es: 5000*/
        Scanner s = new Scanner(System.in);
        float venta, descuento = 0, pagar;
        
        System.out.print("Digite por favor el monto de la venta:");
        venta = s.nextFloat();
        
        //forma 1: calcular el descuento y almacenarlo en una variable
        if( venta > 10000 )
            descuento = venta*0.2f;
        
        System.out.println("El descuento es: "+descuento);
        pagar = venta-descuento;
        System.out.println("El valor a pagar es: "+pagar);
    }
    
}
