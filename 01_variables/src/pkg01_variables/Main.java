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
        
        //Concatenacion: unir dos elementos y transformarlos en un solo String
        //el caracter para concatenar es el signo de suma +
        char char1 = 'A', char2 = 'B';
        System.out.println( char1+char2 );
        //porque no imprimio AB sino en su lugar 131? porque el operador + si se aplica
        //a elementos char este suma el valor numerico de cada char. A vale 65, B vale 66
        //en la tabla ASCII de caracteres (American Standard Code for Information Interchange)
        //Si antepone un String y luego suma dos elementos char entonces se CONCATENAN.
        System.out.println( ""+char1+char2 );
        //esto se debe a que el operador de suma (+) en lenguajes basados en C esta sobrecargado
        //o sea que se comporta de acuerdo a sus parametros de entrada.
        //String+numero = String
        //numero+String = String
        //numero+numero = numero
        System.out.println("La suma de "+d1+" mas "+d2+" es "+d1+d2);
        //lo anterior arroja un resultado erroneo porque se sigue la regla de
        //concatenar String+numero, como se resuelve?
        System.out.println("La suma de "+d1+" mas "+d2+" es "+(d1+d2) );
        //importante: si hay operaciones de resta, multiplicacion, division, modulo, etc.
        //debe ponerlas entre parentesis, sino no va a compilar el programa en JAVA
        System.out.println("La resta de "+d1+" menos "+d2+" es "+(d1-d2));
        
        //funciones de matematicas en JAVA:
        //para ello existe una clase llamada Math y se usa asi:
        //pow: elevar un numero base a determinado exponente.
        double valor1 = 5;
        System.out.println( valor1+" al cuadrado es "+Math.pow(valor1, 2) );
        System.out.println( valor1+" a la 5 potencia es "+Math.pow(valor1, 5) );
        //se puede usar pow para obtener raices:
        double valor2 = 27;
        System.out.println("La raiz cubica de "+valor2+" es "+Math.pow(valor2, 1.0/3.0));
        //ojo note la importancia de colocar 1.0/3.0 en lugar de 1/3, porque?
        // 1/3 es considerado en JAVA una division de enteros por lo tanto el resultado seria 0:
        System.out.println("La division de 1/3 es: "+(1/3));
        // 1.0/3.0 es considerado por JAVA como division de doubles por lo tanto es 0.3333333
        System.out.println("La division de 1.0/3.0 es: "+(1.0/3.0));
        
        //valores constantes importantes de la clase Math:
        System.out.println("El valor de PI: "+Math.PI);
        System.out.println("El valor del exponencial es: "+Math.E);
        
        //calculo de logaritmos:
        double valor3 = 2;
        System.out.println("El logaritmo de "+valor3+" es "+Math.log(valor3));
        System.out.println("El logaritmo base 10 de "+valor3+" es "+Math.log10(valor3));
        System.out.println("El logaritmo natural de "+valor3+" es "+Math.log1p(valor3));
        
        //sqrt = Square root o raiz cuadrada:
        System.out.println("La raiz cuadrada de "+valor3+" es "+Math.sqrt(valor3));
        double valor4 = 25;
        System.out.println("La raiz cuadrada de "+valor4+" es "+Math.sqrt(valor4));
        
        //round: redondear al proximo entero siempre y cuando se supere la mitad
        double valor5 = 3.32, valor6 = 7.5, valor7 = 4.00005, valor8 = 6.0, valor9 = 2.78;
        System.out.println("round de "+valor5+" es "+Math.round(valor5));
        System.out.println("round de "+valor6+" es "+Math.round(valor6));
        System.out.println("round de "+valor7+" es "+Math.round(valor7));
        System.out.println("round de "+valor8+" es "+Math.round(valor8));
        System.out.println("round de "+valor9+" es "+Math.round(valor9));
        
        //ceil: devuelve el entero superior del valor enviado
        System.out.println("ceil de "+valor5+" es "+Math.ceil(valor5));
        System.out.println("ceil de "+valor6+" es "+Math.ceil(valor6));
        System.out.println("ceil de "+valor7+" es "+Math.ceil(valor7));
        System.out.println("ceil de "+valor8+" es "+Math.ceil(valor8));
        System.out.println("ceil de "+valor9+" es "+Math.ceil(valor9));
        
        //floor: devuelve el entero del valor enviado
        System.out.println("floor de "+valor5+" es "+Math.floor(valor5));
        System.out.println("floor de "+valor6+" es "+Math.floor(valor6));
        System.out.println("floor de "+valor7+" es "+Math.floor(valor7));
        System.out.println("floor de "+valor8+" es "+Math.floor(valor8));
        System.out.println("floor de "+valor9+" es "+Math.floor(valor9));
        
        //ejemplo:
        System.out.println("La parte decimal de "+valor5+" es "+( valor5-Math.floor(valor5) ) );
        
    }
    
}
