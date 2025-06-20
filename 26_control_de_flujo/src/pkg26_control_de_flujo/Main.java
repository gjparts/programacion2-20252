package pkg26_control_de_flujo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ejemplo de uso de break
        Haga una estructura de repeticion for que lea 50 numeros
        long positivos.
        -> Si durante la digitacion se ingresa un numero negativo
           debera terminar con la lectura de los 50 numeros.
        -> al finalizar muestre la suma de los numeros positivos leidos.*/
        Scanner s = new Scanner(System.in);
        long numero, suma = 0;
        for(int i = 1; i <= 50; i++){
            System.out.print("Digite un numero entero positivo: ");
            numero = s.nextLong();
            if( numero < 0 ) break; //se rompe la estructura de repeticion
            suma += numero;
        }
        System.out.println("Suma de numeros positivos: "+suma);
    }    
}
