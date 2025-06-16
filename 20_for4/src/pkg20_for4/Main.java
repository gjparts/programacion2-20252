package pkg20_for4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa que pida 5 numeros al usuario,
        al finalizar muestre el promedio de esos numeros,
        cuantos fueron pares, cuantos fueron impares,
        cual es el menor y cual es el mayor.
        -> Debe funcionar con positivos y negativos.*/
        Scanner s = new Scanner(System.in);
        int n; //variable temporal
        int suma = 0;   //variable acumuladora
        int pares = 0, impares = 0; //variables contador
        int mayor = 777, menor = 777; //variables bandera, sobreescritas en primera iteracion
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Digite numero entero: ");
            n = s.nextInt();
            suma += n;
            //en la primer iteracion, se define los valores de inicio para mayor y menor
            if( i == 1 ){
                mayor = n;
                menor = n;
            }
            if( n > mayor ) mayor = n;  //mayor = Math.max(n,mayor);
            if( n < menor ) menor = n;  //menor = Math.min(n,menor);
            //par o impar?
            if( n%2 == 0 )
                pares++;
            else
                impares++;
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        System.out.println("El promedio es: "+(suma/5.0));
        System.out.println("Cantidad de pares: "+pares);
        System.out.println("Cantidad de impares: "+impares);
    }
    
}
