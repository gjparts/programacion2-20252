package pkg23_while_do_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa que capture N cantidad de edades de personas.
        ->  el programa termina cuando se digite una edad menor que cero.
        ->  una vez que termine el programa debe imprimir una tabla que resuman cuantas
            edades se leyeron por grupo de edad de acuerdo al ejemplo siguiente:
        Grupo de Edad	Cantidad	Descripcion
        Menores de edad	XXXX		de 0 a menos de 18 años
        Mayores de edad	XXXX		de 18 a menos de 21 años
        Adultos		XXXX		de 21 a menos de 60 años
        Tercera edad	XXXX		de 60 años en adelante
        -> La columna de la descripcion no la vaya a imprimir*/
        Scanner s = new Scanner(System.in);
        int edad = 1234; //variable temporal, en este caso no importa el valor de inicio
                        //mientras permita ingresa al menos una vez al while
        int menores = 0, mayores = 0, adultos = 0, terceraEdad = 0; //variables contador
        while( edad >= 0 ){
            System.out.print("Digite una edad: ");
            edad = s.nextInt();
            //clasificar la informacion en las variables contador
            if( edad >= 0 && edad < 18 ) menores++;
            if( edad >= 18 && edad < 21 ) mayores++;
            if( edad >= 21 && edad < 60 ) adultos++;
            if( edad >= 60 ) terceraEdad++;
        }
        System.out.println("Grupo de edad\tCantidad");
        System.out.println("Menores de edad\t"+menores);
        System.out.println("Mayores de edad\t"+mayores);
        System.out.println("Adultos\t\t"+adultos);
        System.out.println("Tercera Edad\t"+terceraEdad);
    }
    
}
