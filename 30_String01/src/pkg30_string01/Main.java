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
    }    
}
