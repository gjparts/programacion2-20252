/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07_captura6;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se da un descuento por venta, se captura el monto de la venta.
        Si la venta es mayor o igual a 2000 se da un 10% de descuento
        Si la venta es mayor o igual a 5000 se da un 20% de descuento
        Si la venta es mayor o igual a 10000 se da un 30% de descuento
        Si la venta es mayor o igual a 20000 se da un 50% de descuento
        Hacer un programa que imprima el valor del descuento y el valor a pagar*/
        Scanner s = new Scanner(System.in);
        float venta, descuento = 0;
        System.out.print("Digite el monto de la venta: ");
        venta = s.nextFloat();
        
        //forma 2: if sin else (no es optimo) aqui no importa el orden
        if( venta >= 2000 ) descuento = venta*0.1f;
        if( venta >= 5000 ) descuento = venta*0.2f;
        if( venta >= 10000 ) descuento = venta*0.3f;
        if( venta >= 20000 ) descuento = venta*0.5f;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar es: "+(venta-descuento));
    }
    
}
