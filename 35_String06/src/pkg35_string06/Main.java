package pkg35_string06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Arreglo de String
        Es una coleccion de objetos de clase String.
        Formas de declarar:
        1) inicializado con valores predeterminados (default)
        2) prellenado con valores de inicio*/
        //1) inicializado con valores default:
        String arr1[] = new String[5];
        //que valores predeterminados pone JAVA al String?
        for( int i = 0; i < arr1.length; i++ ){
            System.out.println( arr1[i] );
        }
        //JAVA asigna una posicion de memoria null a cada elemento de
        //un arreglo de String si no se establece valores de inicio.
        System.out.println("****************************");
        //2) prellenado con valores de inicio
        String frutas[] = {"Uva","Fresa","Pera","Manzana","Melon","Naranja","Mandarina"};
        for( int i = 0; i < frutas.length; i++ ){
            System.out.println( frutas[i] );
        }
        /*Para el arreglo de frutas.
        Hacer un programa que pregunte una fruta, el programa debera
        buscar dicha fruta dentro del arreglo de frutas.
        Si la fruta es encontrada mostrar la posicion en donde se encuentra
        la primer coincidencia.
        Si la fruta no es encontrada entonces mostrar un mensaje indicadolo.
        -> ignore mayusculas/minusculas durante la busqueda*/
        Scanner s = new Scanner(System.in);
        System.out.print("digite fruta a buscar: ");
        String buscar = s.nextLine();
        
    }
    
}
