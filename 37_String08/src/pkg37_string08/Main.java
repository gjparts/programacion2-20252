package pkg37_string08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Metodo contains
        /*Nos indica si un String se ha encontrado dentro de otro String
        -> este metodo devuelve true o false (boolean)
        -> no altera al String porque solo hace una busqueda
        -> cuando busca no ignora mayusculas/minusculas.*/
        String str = "Hay un CARACOL cerca de la roca a la orilla del Mar.";
        System.out.println(str);
        System.out.println("str contiene la palabra roca? "+str.contains("roca"));
        System.out.println("str contiene la palabra caracol? "+str.contains("caracol"));
        System.out.println("str contiene la palabra Mar? "+str.contains("Mar"));
        System.out.println("str contiene la palabra caracol ignorando may/min.? "+str.toLowerCase().contains("caracol")  );
        
        /*Pregunte un String al usuario, luego el programa va a buscar ese String dentro de la variable str
        Si el texto es encontrado imprima: SE HA ENCONTRADO, de lo contrario imprima: NO SE ENCONTRO.
        -> la busqueda debe ignorar mayusculas y minusculas.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un String a buscar: ");
        String buscado = s.nextLine();
        if( str.toUpperCase().contains( buscado.toUpperCase() ) == true )
            System.out.println("SE HA ENCONTRADO");
        else
            System.out.println("NO SE ENCONTRO");
    }    
}
