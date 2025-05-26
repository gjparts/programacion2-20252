/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_variables;

/**
 *
 * @author Gerardo
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Variable: es un espacio de memoria donde se guarda un valor.
        Toda variable debe de tener un tipo de dato.
        Los tipos de dato se agrupan en:
        1) Tipos de datos primitivos: vienen definidos en el compilador
           del lenguaje. Ejemplos en C++: int, double, float, char, long, bool
        2) Tipos de datos compuestos: estan formado por elementos primitivos.
           ejemplo en JAVA y C++: string,  Scanner, Random, JButton
        
        Consideraciones a la hora de nombrar variables:
        1) No urilice palabra reservadas del lenguaje (for, if, while, etc.)
        2) No utilice espacios en blanco, en su lugar use guiones bajos (notacion hungara)
           numero_de_mascotas, o evite el uso de estos: numeroDeMascotas (camel case)
        3) No utilice caracteres especiales como operadores por ejemplo. *numero &numero
        4) No debe iniciar en numero: 123algo
        5) Dos variables no pueden tener el mismo nombre en el mismo ambito o scope
        6) Debe respetar las mayusculas y minusculas usadas en la definicion de la variable.
        */
        int a; //declaracion de variable sin inicializar
        //OJO! no se puede usar una variable sin valor de inicio:
        //System.out.println(a);
        //debe colocarle un valor a la variable para usarla:
        a = 9;
        System.out.println(a);
        //declarar una variable e inicializala al mismo tiempo
        int b = 90;
        System.out.println(b);
    }
    
}
