package pkg10_if_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte la edad de una persona,
        luego van a imprimir a que grupo de edad pertenece de
        acuerdo a la tabla siguiente:
        Rango			Grupo
        de 0 a menos de 18	Menor de edad
        entre 18 y 20		Mayor de edad
        entre 21 y 59		Adulto
        De 60 en delante	Tercera edad*/
        Scanner s = new Scanner(System.in);
        int edad;
        System.out.print("Digite su edad: ");
        edad = s.nextInt();
        if( edad >= 0 && edad < 18 ) System.out.println("Menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("Mayor de edad");
        if( edad >= 21 && edad <= 59 ) System.out.println("Adulto");
        if( edad >= 60 ) System.out.println("Tercera edad");
    }    
}
