package pkg39_string10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Leer un numero de cedula de Honduras (DNI), el programa
        unicamente debe validar que este numero tenga exactamente 13 caracteres.
        * el programa antes de validar los 13 caraceres
          deber� eliminar los espacios de relleno, g�iones,
          g�iones bajos, espacios en blanco de la cadena.

        *Luego de leer la cedula y validarla mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) a�o de asentamiento
        4) correlativo en que fue asentado

        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        A�o de asentamiento: 1982
        Correlativo:�01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su DNI: ");
        String dni = s.nextLine();
        //eliminar caracteres no deseados
        dni = dni.replace("-", "").replace("_", "").replace(" ", "");
        //validar que dni sea de 13 caracteres
        if( dni.length() == 13 ){
            System.out.println("Departamento: "+dni.substring(0, 2));
            System.out.println("Municipio: "+dni.substring(2, 4));
            System.out.println("A�o de asentamiento: "+dni.substring(4, 8));
            System.out.println("Correlativo: "+dni.substring(8));
        }
        else
            System.out.println("DNI debe ser de 13 caracteres.");
    }
    
}
