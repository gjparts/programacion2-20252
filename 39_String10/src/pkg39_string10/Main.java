package pkg39_string10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*Metodo substring
        Devuelve un String que se encuentra dentro de otro String,
        sin alterar al String original.
        En JAVA existe dos formas de usarlo:
        1) substring(posicion_inicial)
            devuelve un String desde la posicion inicial llegando
            hasta el final del string origen.
        2) substring(posicion_inicial, posicion_final)
            devuelve un String desde la posicion inicial llegando
            hasta la posicion final.*/
        String str = "Erase una vez en un pais muy muy lejano.";
        System.out.println(str);
        //substring solo con posicion inicial:
        System.out.println( str.substring(7) );
        System.out.println( str.substring(15) );
        //si quiere referirse a una posicion inexistente dara un error IndexOutOfBounds:
        //System.out.println( str.substring(1000) );
        //tamien puede almacenar el resultado de substring en una variable
        String fragmento = str.substring(32);
        System.out.println("fragmento: "+fragmento);
        
        //substring con posicion inicial y final:
        System.out.println( str.substring(0, 11) );
        System.out.println( str.substring(8, 17) );
        //recuerde que en JAVA la posicion inicial debe de ser menor a la final
        //System.out.println( str.substring(11, 5) );

        /*Leer un numero de cedula de Honduras (DNI), el programa
        unicamente debe validar que este numero tenga exactamente 13 caracteres.
        * el programa antes de validar los 13 caraceres
          deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.

        *Luego de leer la cedula y validarla mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado

        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su DNI: ");
        String dni = s.nextLine();
        //eliminar caracteres no deseados
        dni = dni.replace("-", "").replace("_", "").replace(" ", "");
        //validar que dni sea de 13 caracteres
        if( dni.length() == 13 ){
            System.out.println("Departamento: "+dni.substring(0, 2));
            System.out.println("Municipio: "+dni.substring(2, 4));
            System.out.println("Año de asentamiento: "+dni.substring(4, 8));
            System.out.println("Correlativo: "+dni.substring(8));
        }
        else
            System.out.println("DNI debe ser de 13 caracteres.");
    }
    
}
