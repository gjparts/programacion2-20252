package pkg16_switch2_random;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       /*Haga un programa que genere un numero
        al azar entre 4 y 9.
        Dependiendo del numero generado debera
        imprimir el nombre de un color, estos pueden ser:
        4 = Verde
        5 = Azul
        6 = Rojo
        7 = Gris
        8 = Amarillo
        9 = Blanco
        Evalue el numero al azar utilizando una
        estructura de seleccion switch.*/
        Random r = new Random();
        int n = r.nextInt(9-4+1)+4;
        switch(n){
            case 4: System.out.println("Verde"); break;
            case 5: System.out.println("Azul"); break;
            case 6: System.out.println("Rojo"); break;
            case 7: System.out.println("Gris"); break;
            case 8: System.out.println("Amarillo"); break;
            case 9: System.out.println("Blanco"); break;
            default: System.out.println("Numero no soportado");
        }
    }
    
}
