package pkg30_string01;
public class Main {
    public static void main(String[] args) {
        /*tipo de dato String
        Es una coleccion de elementos char.
        En JAVA es una clase para crear objetos.
        En JAVA es nativa, por lo tanto no es necesario importar paquetes,
        forma parte del paquete java.lang que ya viene implementado.
        En español se traduce a Cadena de Texto.*/
        //declarar un objeto String:
        String str1;
        //String es auto-instanciable, no necesita de new para crear un nuevo objeto.
        //Un String al que no se le ha asignado un valor no se puede imprimir:
        //System.out.println(str1);
        str1 = "UNAH";
        System.out.println("str1: "+str1);
        //tambien se puede declarae e inicializar
        String str2 = "San Pedro Sula";
        String str3 = "Feria Juniana", str4 = "Baleadas", str5 = "";
        
        //concatenar String
        String cadena1 = "Naranja";
        String cadena2 = "Verde";
        String cadena3 = cadena1+" "+cadena2; //concatenar 3 string
        System.out.println("cadena3: "+cadena3);
        
        //Se puede almacenar numeros en String?
        //String s1 = 6;  //de forma tradicional no
        String s1 = ""+6; //pero usando ley de precedencia de operadores con String vacio si
        String s2 = ""+3.1416;
        String s3 = ""+2.25f;
        String s4 = ""+1401198201055L;
        
        //conocer la longitud de un String
        String s5 = "Ingenieria en Sistemas";
        System.out.println("s5: "+s5);
        System.out.println("Longitud de s5: "+s5.length());
        
        //cada caracter en un String se numera desde 0 hasta N-1 (Zero indexing)
        //para obtener un caracter de una posicion determinada en un String se usa el
        //metodo charAt y se le da la posicion del char deseado.
        String pais = "Honduras";
        System.out.println("pais: "+pais);
        System.out.println("Caracter 5: "+pais.charAt(5));
        System.out.println("Ultimo caracter: "+pais.charAt( pais.length()-1 ));
        System.out.println("Primer caracter: "+pais.charAt(0));
        System.out.println("Penultimo caracter: "+pais.charAt( pais.length()-2 ));
        
        String comida =  "Baleadas";
        //hacer un programa que imprima el string comida colocando cada caracter
        //en un renglon diferente.
        for( int i = 0; i < comida.length(); i++ ){
            System.out.println( comida.charAt(i) );
        }
        
        //transformaciones de String
        //obtener una version en mayusculas o minusculas de un String
        //metodos a usar: toUpperCase() toLowerCase()
        //estos metodos no afectan al String original
        String ciudad = "San Pedro Sula";
        System.out.println("ciudad en mayusculas: "+ciudad.toUpperCase());
        System.out.println("ciudad en minusculas: "+ciudad.toLowerCase());
        System.out.println("ciudad (String original): "+ciudad);
        //si desea alterar al String original, simplente los sobre-escribe con
        //su version mayuscula o minuscula.
        ciudad = ciudad.toUpperCase();
        System.out.println("ciudad (String original): "+ciudad);
        ciudad = ciudad.toLowerCase();
        System.out.println("ciudad (String original): "+ciudad);
        
        /*metodo trim()
        devuelve una version del String sin los espacios iniciales y finales
        que son conocidos como espacios de rellemo.
        -> Este metodo no afecta al String original.*/
        String juguete = "     Figura de Accion                        ";
        System.out.println("juguete (original): "+juguete+".");
        System.out.println("longitud de juguete (original): "+juguete.length());
        //impresion aplicando trim()
        System.out.println("juguete (trim): "+juguete.trim()+".");
        System.out.println("longitud de juguete (trim): "+juguete.trim().length());
        //se habra afectado la variable original?
        System.out.println("juguete (original): "+juguete+".");
        //se quiere afectar a la variable original:
        juguete = juguete.trim();
        System.out.println("juguete (original): "+juguete+".");
        
        String platillo = "     Pizza Super Suprema           ";
        /*Ejercicio: imprima la variable platillo; pero sin relleno de
        espacios y en mayusculas sin alterar a la variable original usando
        una sola instruccion.*/
        System.out.println( platillo.trim().toUpperCase() ); //forma 1
        System.out.println( platillo.toUpperCase().trim() ); //forma 2
        
        //Concatenar valores char a un String
        String carro = "Toyota Corolla 2012";
        //concatenar un char sin afectar la variable original:
        System.out.println(carro+'L');
        System.out.println("carro (original): "+carro);
        //concantear un char afectando a la variable original:
        carro = carro+'L';
        System.out.println("carro (original): "+carro);
        //concatenar varios char a un String afectando la variable original
        String cliente = "Filomeno Colinas";
        cliente = cliente+'A'+'B'+'C';
        System.out.println("cliente (original): "+cliente);
        //pero en esos casos es mas practico concatenar otro String:
        String estudiante = "Estevancito Maravilla";
        estudiante = estudiante+"ABC";
        System.out.println("estudiante (original): "+estudiante);
        //hay situaciones donde puede tener el char en una variable aparte:
        char equis = 'X';
        String proveedor = "Curco Bain";
        proveedor = proveedor+equis;
        System.out.println("proveedor (original): "+proveedor);
        //lo que no conviene hacer:
        //concatenar varios char usando un operador de incremento
        String mascota = "Firulais";
        mascota += 'Z'; //esto si se puede, es como decir: mascota = mascota + 'Z'
        mascota += 'W'+'X'+'R'; //esto no funciona bien
        System.out.println("mascota (original): "+mascota);
        
        String persona = "Gerardo Josue Portillo";
        /*Ejercicio: genere una nueva variable String que sea copia de
        la variable persona; pero reemplazando cada espacio en blanco con un guion
        bajo en la copia, sin utilizar el metodo replace. Imprima la nueva variable.*/
        String copia = "";
        for( int i = 0; i < persona.length(); i++ ){
            if( persona.charAt(i) == ' ' )
                copia = copia + '_';
            else
                copia = copia + persona.charAt(i);
        }
        System.out.println(copia);
        
        //ejemplo anterior utilizando operador ternario
        copia = ""; //copia vacia
        for( int i = 0; i < persona.length(); i++ )
            copia = copia + ( persona.charAt(i) == ' ' ? '_' : persona.charAt(i) );
        
        System.out.println(copia);
    }    
}
