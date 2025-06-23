package pkg28_arreglos;
public class Main {
    public static void main(String[] args) {
        /*Arreglo (Array)
        Es una estructura de datos secuencial, estatica y homogenea
        que permite agrupar datos en una coleccion.
        -> Secuencial: todos sus elementos se almacenan uno despues del otro
                       en la memoria. (su opuesto es aleatorio)
        -> Estatica:   no puede cambiarse su tamaño (su opuesto es dinamico)
        -> Homogenea:  todos sus elementos son del mismo tipo de
                       dato (su opuesto es heterogeneo)
        -> Sus elementos se numeran desde 0 hasta N-1, a esto se le conoce
           como Zero indexing*/
        
        /*maneras de declarar arreglos en JAVA:
        1) declarar el arreglo sin datos
        2) declarar e inicalizar el arreglo con datos predeterminados
        3) declarar e inicializar el arreglo prellenado con datos*/
        
        //1) declarar el arreglo sin datos
        int arreglo[];
        //este arreglo asi como esta no es utilizable; pero mas adelante se
        //puede asignar a un arreglo ya existente que si tenga datos.
        //System.out.println("Direccion de memoria de arreglo: "+arreglo);
        
        //2) declarar e inicalizar el arreglo con datos predeterminados
        int arr1[] = new int[6];
        //lo anterior crear un objeto de tipo arreglo unidimensional de
        //enteros de 6 elementos.
        //JAVA le coloca a cada entero como valor predeterminado CERO.
        //imprimamos alguno de los 6 elementos de dicho arreglo:
        System.out.println( arr1[0] );
        System.out.println( arr1[1] );
        System.out.println( arr1[2] );
        System.out.println( arr1[3] );
        System.out.println( arr1[4] );
        System.out.println( arr1[5] );
        //System.out.println( arr1[6] ); se numera de 0 a N-1, este item no es accesible
        
        //asignar manualmente valores a las posiciones del arreglo:
        arr1[2] = 777;
        arr1[5] = -6;
        arr1[1] = 3;
        
        //recorrer e imprimir los elementos de un arreglo usando una estructura de repeticion
        for( int i = 0; i < arr1.length; i++ ){
            System.out.print("Posicion: "+i);
            System.out.println("\tValor: "+arr1[i]);
        }
        //tambien puede usar una estructura de repeticion for-each con la cual no es necesario
        //proporcionar el length de la estructura
        //IMPORTANTE: for-each no da acceso a la posicion solo al valor
        //en este caso i tomar el valor de cada elemento en arr1:
        for( int i : arr1 ){
            System.out.println("Valor: "+i);
        }
        System.out.println("Longitud de arr1: "+arr1.length);
        
        System.out.println("El primer elemento de arr1 es: "+arr1[0]);
        System.out.println("El ultimo elemento de arr1 es: "+arr1[5]);
        System.out.println("El ultimo elemento de arr1 es: "+arr1[ arr1.length-1 ]);
    }
    
}
