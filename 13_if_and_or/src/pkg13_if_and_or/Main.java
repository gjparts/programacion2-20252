package pkg13_if_and_or;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*En una ferreteria se da un descuento del 10% a las
        personas con edades entre 18 y 24 ó entre 40 y 60.

        Pregunte el monto de lo vendido y la edad, y luego imprima
        el monto el descuento otorgado y el total a pagar.

        -> Resuelvalo utilizando operadores logicos (AND,OR)*/
        Scanner s = new Scanner(System.in);
        float venta, descuento = 0;
        int edad;
        System.out.print("Digite el monto de lo vendido: ");
        venta = s.nextFloat();
        System.out.print("Digite la edad del cliente: ");
        edad = s.nextInt();
        
        if( edad >= 18 && edad <= 24 || edad >= 40 && edad <= 60 )
            descuento = venta*0.10f;
        
        System.out.println("Descuento: "+descuento);
        System.out.println("Total a pagar: "+(venta-descuento));
    }    
}
