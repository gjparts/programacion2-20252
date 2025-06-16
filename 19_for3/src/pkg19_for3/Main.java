package pkg19_for3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de
        esos 10 numeros, asi como cual es el mayor de los 10 numeros.
        -> el programa debe funcionar tambien con negativos.*/
        //Forma 2: en la primera iteracion se determina el mayor
        Scanner s = new Scanner(System.in);
        double n; //variable temporal para leer numeros
        double suma = 0; //variable acumulador para hacer la suma
        double mayor = 777; //variable bandera que determina el numero mayor
                            //aqui no importa que valor de inicio ponga, se sobrescribe
                            //en la primera iteracion
        //leer los 10 numeros e irlos operando
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero: ");
            n = s.nextDouble();
            //es la primera iteracion: el numero leido es el mayor
            if( i == 1 ) mayor = n;
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
