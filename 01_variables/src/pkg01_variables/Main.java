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
        
        //declarar multiples variables del mismo tipo
        int num1, num2, num3;
        //declarar e inicializar multiples variables del mismo tipo
        int cifra1 = 7, cifra2 = 100, cifra3 = -89;
        double v1 = 5.6, v2 = 8.23;
        
        //en JAVA a las variables float con decimales debemos
        //ponerles una f al final
        float f1 = 6.7f;
        
        //tipo de dato long
        //es un numero entero de alta precision, su capacidad es de 64 bit (8 bytes)
        //a diferencia del entero (int) que es de 32 bit (4 bytes)
        //el numero 1234123412345 no puede guardarse como int:
        //int valor10 = 1234123412345;
        //pero se puede guardar en un long: (debe colocar L al final del numero)
        long valor10 = 1234123412345L;
        System.out.println("valor10 es igual a "+valor10);
        
        //tipo de dato char: almacena un solo caracter.
        //una variable char mide: 1 byte (8 bit)
        //se usa comilla simple o sea el caracter 39
        char c1 = 'g';
        char c2 = '/';
        //si usa caracter slash inverso debe poner doble; pero solo es un char:
        char c3 = '\\';
        System.out.println("El valor de c1 es "+c1);
        System.out.println("El valor de c2 es "+c2);
        System.out.println("El valor de c3 es "+c3);
        
        //tipo de dato boolean: guarda true o false (1 bit)
        boolean respuesta = true;
        System.out.println("El valor de respuesta es "+respuesta);
        respuesta = false;
        System.out.println("El valor de respuesta es "+respuesta);
        //una expresion de comparacion tambien devuelve un valor booleano:
        boolean evaluacion1;
        int e1 = 3, e2 = 9;
        evaluacion1 = e1 > e2;
        System.out.println("El valor de evaluacion1 es "+evaluacion1);
        
        /*Ley de precedencia de operadores
        Las expresiones deben evaluarse de izquierda a derecha dando prioridad
        a las operaciones de acuerdo a la tabla siguiente:
        a) Parentesis ()
        b) exponentes Math.pow
        c) multiplicaciones y divisiones * /
        d) sumas y restas + -
        e) operadores logicos NOT  !
        f) operadores logicos AND  &&
        g) operadores logicos OR   ||  (caracter 124)
        */
        double d1 = 5, d2 = 9, d3 = 2, d4 = 10;
        System.out.println( d1+d2/d3 );
        System.out.println( (d1+d2)/d3 );
        System.out.println( (d1-d2)/(d3+d4)*d1 );
    }
    
}
