/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06_captura5;

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
        /*Se da un descuento por venta, se captura el monto de la venta.
        Si la venta es mayor o igual a 2000 se da un 10% de descuento
        Si la venta es mayor o igual a 5000 se da un 20% de descuento
        Si la venta es mayor o igual a 10000 se da un 30% de descuento
        Si la venta es mayor o igual a 20000 se da un 50% de descuento
        Hacer un programa que imprima el valor del descuento y el�valor�a�pagar*/
        Scanner s = new Scanner(System.in);
        float venta, descuento;
        System.out.print("Digite el monto de la venta: ");
        venta = s.nextFloat();
        
        //forma 1: estructurar el problema con if-else
        //esta es una forma optima de hacerlo, no olvide que se comienza
        //desde el valor mayor hasta el menor.
        if( venta >= 20000 )
            descuento = venta*0.5f;
        else
            if( venta >= 10000 )
                descuento = venta*0.3f;
            else
                if( venta >= 5000 )
                    descuento = venta*0.2f;
                else
                    if( venta >= 2000 )
                        descuento = venta*0.1f;
                    else
                        descuento = 0;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar es: "+(venta-descuento));
    }
    
}
