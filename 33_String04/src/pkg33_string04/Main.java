package pkg33_string04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Comprar dos String en JAVA
        Un String en JAVA es un objeto por eso para comparar el contenido
        de dos String no se deberia usar ==, ya que este operador
        comparar las direcciones de memoria y no los contenidos de dos objetos.
        == solo debe usarse para comparar tipos de dato primitivos.
        Para comparar dos objetos en JAVA basandose en su contenido
        debe usar el metodo equals.*/
        //Al final es posible comparar dos String usando == ?
        //se puede solo si los String fueron declarados con valores fijos
        //en el codigo fuente; pero si estos String dependen de la interaccion
        //con el usuario, ya no deben compararse con ==
        String a = "Pera";
        String b = "Pera";
        if( a == b )
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b no son iguales");
        //aparentemente funciona bien...
        System.out.println("Direccion de memoria de a: "+System.identityHashCode(a));
        System.out.println("Direccion de memoria de b: "+System.identityHashCode(b));
        /*observe que a y b tienen la misma direccion de memoria, por lo tanto ==
        asume que son iguales; pero porque pasa esto?
        porque el compilador para optimizar recursos si encuentra dos variables que
        apuntan a un mismo valor que jamas va a cambiar (en este caso Pera) pues
        les asigna la misma direccion de memoria y hace pensar a == que sus contenidos
        son iguales.*/
        //y si a y b no fueran valores fijos sino que son capturados desde el Usuario:
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a: ");
        a = s.nextLine();
        System.out.print("Digite b: ");
        b = s.nextLine();
        //cuando se compara dos valores que son variables y no constantes
        //entonces a == b no va funcionar correctamente, si pone Pera en la captura
        //de ambos vera que no son iguales porque lo que se compara son direccion de mem.
        if( a == b ) //INCORRECTO
            System.out.println("a y b son iguales usando ==");
        else
            System.out.println("a y b no son iguales usando ==");
        
        //observe que ahora las direccion de a y b son diferentes:
        System.out.println("Direccion de memoria de a: "+System.identityHashCode(a));
        System.out.println("Direccion de memoria de b: "+System.identityHashCode(b));
        
        //como se deberia comparar? por medio del metodo equals
        if( a.equals(b) == true )
            System.out.println("a y b son iguales usando equals");
        else
            System.out.println("a y b no son iguales usando equals");
        
        //importante: equals no ignora mayusculas y minusculas.
        //como se puede comparar usando equals e ignorar mayus/minusc?
        if( a.toUpperCase().equals(b.toUpperCase()) == true )
            System.out.println("a y b son iguales usando equals y toUpperCase");
        else
            System.out.println("a y b no son iguales usando equals y toUpperCase");
        
        //JAVA tiene un metodo llamado equalsIgnoreCase
        if( a.equalsIgnoreCase(b) == true )
            System.out.println("a y b son iguales usando equalsIgnoreCase");
        else
            System.out.println("a y b no son iguales usando equalsIgnoreCase");
    }    
}
