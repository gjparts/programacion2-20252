package pkg18_for2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de
        esos 10 numeros, asi como cual es el mayor de los 10 numeros.
        -> el programa debe funcionar tambien con negativos.*/
        //Forma 1: determinar el mayor a partir de un valor inicializado
        Scanner s = new Scanner(System.in);
        double n; //variable temporal para leer numeros
        double suma = 0; //variable acumulador para hacer la suma
        double mayor = Double.MAX_VALUE*-1; //variable bandera (flag) que determina el flujo del programa
                      //en este caso la voy a inicializar con el numero mas pequeño
                      //soportado por el tipo de dato.
        //leer los 10 numeros e irlos operando
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero: ");
            n = s.nextDouble();
            //sumar el ultimo numero leido:
            suma += n; //suma = suma + n;
            //si el numero leido es mas grande que el numero mayor
            //entonces el nuevo numero mayor es el numero leido
            if( n > mayor ) mayor = n;
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El numero mayor es: "+mayor);
    }    
}
