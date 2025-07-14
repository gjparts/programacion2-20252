package pkg40_string11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Metodo split
        Retorna un arreglo de elementos String el cual es el resultado
        de dividir en partes a otro String.
        Cada una de las partes se delimita por un String conocido como
        token o separador.*/
        String str = "manzana verde,sandia,pera,kiwi,carambola,zapote,melon,fresa";
        String arr1[]; //declarar arrelo de String sin inicializar
        //apuntar arr1 hacia el arreglo resultante del meotodo split en str:
        arr1 = str.split(","); //donde encuentre una coma genera un nuevo item
        //recorrer el arreglo resultante:
        for(int i = 0; i < arr1.length; i++){
            System.out.println( arr1[i] );
        }
        System.out.println("--------------------------");
        
        //en JAVA el token puede ser cualquier String:
        str = "HondaSEPARADORCivicSEPARADOR2004SEPARADORNegroSEPARADORImportado";
        arr1 = str.split("SEPARADOR");
        //recorrer el arreglo resultante:
        for(int i = 0; i < arr1.length; i++){
            System.out.println( arr1[i] );
        }
        System.out.println("--------------------------");
        
        //en JAVA hay algunos caracteres no permitidos para token:
        str = "rojo|verde|azul|amarillo|gris";
        //la barra devuelve split por caracter y eso no es lo que queremos
        //para resolverlo, reemplace el caracter no aceptado por uno aceptado
        //antes de hacer split:
        arr1 = str.replace("|",",").split(","); //cambio barras por comas
                                                //hago split a la comas
        //recorrer el arreglo resultante:
        for(int i = 0; i < arr1.length; i++){
            System.out.println( arr1[i] );
        }
        System.out.println("--------------------------");
        /*Haga un programa que pregunte un String al usuario,
        el programa dira cuantas palabras tiene el String
        tomando en cuenta que cada palabra se separara por solo un espacio
        en blanco.
        Ejemplo:
        Digitar String: Gerardo Josue Portillo
        numero de palabras: 3*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un string: ");
        str = s.nextLine();
        //forma 1:
        arr1 = str.split(" ");
        System.out.println("Numero de palabras: "+arr1.length);
        //forma 2:
        System.out.println("Numero de palabras: "+str.split(" ").length);
    }    
}
