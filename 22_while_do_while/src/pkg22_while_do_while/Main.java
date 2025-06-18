package pkg22_while_do_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa que lea N cantidad de numeros positivos.
        La lectura de los numeros va a terminar cuando se digite un numero negativo.
        Una vez termine de leerse los numeros, imprima la suma de todos los numeros
        positivos leidos. Resuelvalo usando while o do-while.*/
        Scanner s = new Scanner(System.in);
        double n; //variable temporal
        double suma = 0.00; //variable acumuladora

        //usando do-while
        do{
            System.out.print("Digite un numero positivo: ");
            n = s.nextDouble();
            if( n >= 0 ) suma += n;
        }while( n >= 0 );
        System.out.println("Suma: "+suma);
    }    
}
