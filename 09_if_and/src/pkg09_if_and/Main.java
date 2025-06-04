package pkg09_if_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Se da un descuento por venta, se captura el monto de la venta.
        Si la venta es mayor o igual a 2000 se da un 10% de descuento
        Si la venta es mayor o igual a 5000 se da un 20% de descuento
        Si la venta es mayor o igual a 10000 se da un 30% de descuento
        Si la venta es mayor o igual a 20000 se da un 50% de descuento
        Hacer un programa que imprima el valor del descuento y el valor a pagar
        -> Resuelvalo utilizando operadores logicos.*/
        Scanner s = new Scanner(System.in);
        float venta, descuento = 0;
        System.out.print("Digite el monto de lo vendido: ");
        venta = s.nextFloat();
        //calcular el descuento (con AND puede abarcar rangos numericos)
        //este ejemplo esta optimizado
        if( venta >= 2000 && venta < 5000 ) descuento = venta*0.1f;
        if( venta >= 5000 && venta < 10000 ) descuento = venta*0.2f;
        if( venta >= 10000 && venta < 20000 ) descuento = venta*0.3f;
        if( venta >= 20000 ) descuento = venta*0.5f;
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar sera: "+(venta-descuento));
    }    
}
