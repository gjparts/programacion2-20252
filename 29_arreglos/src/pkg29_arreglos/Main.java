package pkg29_arreglos;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa donde este declarado un arreglo unidimensional
        de numeros enteros de tamaño 10, debera llenar cada uno de los elementos
        de ese arreglo con un numero al azar entre 8 y 76 no
        importa que se repitan.
        Debera tambien imprimir dicho arreglo una vez lo halla llenado.*/
        int arreglo[] = new int[10];
        Random r = new Random();
        for( int i = 0; i < arreglo.length; i++ ){
            arreglo[i] = r.nextInt(76-8+1)+8; //asignar el numero al azar generado
            System.out.println("Posicion "+i+", Valor: "+arreglo[i]);
        }
        /*Ahora en este mismo programa, cree un arreglo que sea una
        copia del arreglo que lleno con numeros al azar.
        Pero en la copia va a elevar cada uno de sus numeros al cubo.
        Imprima el contenido del arreglo copia.*/
        int copia[] = new int[10];
        System.out.println("*********************************************");
        for( int i = 0; i < arreglo.length; i++ ){
            copia[i] = (int)Math.pow(arreglo[i],3);
            System.out.println("Posicion "+i+", Valor: "+copia[i]);
        }
    }    
}
