package pkg11_if_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte al usuario por su salario mensual
        y su antiguedad en años.
        El programa va a imprimir cuanto le toca de bonificacion,
        la cual se calcula de la siguiente manera:
        Multiplique el salario mensual por un % de acuerdo a su
        antiguedad basado en la siguiente tabla:
        
        Antiguedad		 % bono
        menos de 5 años		 10%
        de 5 a menos de 10 años	 15%
        de 10 a menos de 20 años 20%
        de 20 años o más	 25%*/
        Scanner s = new Scanner(System.in);
        double salario, antiguedad, bono = 0;
        System.out.print("Digite su salario mensual: ");
        salario = s.nextDouble();
        System.out.print("Digite sus años de servicio: ");
        antiguedad = s.nextDouble();
        //calculo
        if( antiguedad < 5 ) bono = salario*0.10;
        if( antiguedad >= 5 && antiguedad < 10 ) bono = salario*0.15;
        if( antiguedad >= 10 && antiguedad < 20 ) bono = salario*0.20;
        if( antiguedad >= 20 ) bono = salario*0.25;
        System.out.println("La bonificacion es: "+bono);
    }    
}
