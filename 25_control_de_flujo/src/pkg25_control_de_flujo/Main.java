package pkg25_control_de_flujo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Instrucciones de control de flujo
        Permiten alterar el flujo de las iteraciones en una
        estructura de repetecion o de seleccion.
        1) continue:    termina la iteracion actual y pasa a
                        la siguiente.
        2) break:       termina con la estructura de repeticion.*/
        /*Ejemplo de uso de continue
        Haga un programa que recorra los numeros del 1 al 100.
        Debera imprimir todos los numeros excepto aquellos
        que sean multiplos de 7.
        RETO: resolverlo usando la instruccion continue.*/
        for(int i = 1; i <= 100; i++){
            if( i%7 == 0 ) continue;
            System.out.println(i);
        }
        /*Otro ejemplo del uso de continue:
        Haga un programa que lea N cantidad de numeros enteros, solo va a sumar
        aquellos que sean positivos. Si digita un numero negativo debera saltar
        esa iteracion. El programa termina cuando se digite un CERO.
        Al finalizar muestre la suma de los numeros leidos.*/
        int numero;
        int suma = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("Digite numero entero (cero termina): ");
            numero = s.nextInt();
            if( numero < 0 ) continue; //saltar iteracion actual
            suma += numero;
        }while(numero != 0);
        System.out.println("suma de positivos: "+suma);
    }    
}
