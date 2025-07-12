package pkg38_string09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Metodo indexOf (find)
        Devuelve un numero entero que indica la posicion de la
        primer coincidencia encontrada dentro un String.
        -> no altera nada porque es de busqueda
        -> no ignora mayusculas/minusculas
        -> devuelve -1 si no encuentra nada
        -> opcionalmente se le puede poner un segundo parametro
           para indicar desde que caracter vamos a comenzar a buscar.*/
        String x = "El gato es blanco con negro. El gato es bonito. El gato come mucho.";
        System.out.println(x);
        System.out.println("Posiciones donde se encontraron ciertas busquedas:");
        System.out.println("gato: "+x.indexOf("gato"));
        System.out.println("GATO: "+x.indexOf("GATO"));
        System.out.println("GATO (ignorar casing): "+x.toUpperCase().indexOf("GATO"));
        System.out.println("pelota: "+x.indexOf("pelota"));
        System.out.println("mucho: "+x.indexOf("mucho"));
        //indexOf se puede usar con dos parametros:
        //1) el primer parametro es lo que vamos a buscar
        //2) el segundo parametro es desde que posicion vamos a comenzar a buscar
        //se comienza a buscar desde la posicion 0
        System.out.println("primer coincidencia de gato: "+x.indexOf("gato",0));
        //en la busqueda anterior el gato se encontro en la posicion 3, seguimos
        //buscando a partir de la posicion 3+1=4
        System.out.println("siguiente coincidencia de gato: "+x.indexOf("gato",4));
        System.out.println("siguiente coincidencia de gato: "+x.indexOf("gato",33));
        System.out.println("siguiente coincidencia de gato: "+x.indexOf("gato",52));
        
        /*Haga un programa que pregunte un String al usuario.
        El programa va a buscar cuantas veces dicho String esta dentro de x.
        Debe ignorar mayusculas/minusculas y no debe afectar al string original. ejem:
        String a buscar: El
        Veces que se encontro: 3*/
        Scanner s = new Scanner(System.in);
        System.out.print("String a buscar: ");
        String buscar = s.nextLine();
        int ultimaPosicion = 0;
        int contador = 0;
        while( ultimaPosicion >= 0 ){
            ultimaPosicion = x.toUpperCase().indexOf(buscar.toUpperCase(), ultimaPosicion);
            if( ultimaPosicion >= 0 ){
                contador++;
                ultimaPosicion++;
            }
        }
        System.out.println("Se ha encontrado "+contador+" veces.");
    }
}
