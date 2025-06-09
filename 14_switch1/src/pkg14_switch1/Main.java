package pkg14_switch1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Estructura de seleccion switch
        Haga un programa que solicite digitar el mes y el año como
        numeros enteros. Por ultimo debe imprimir cuantos dias
        tiene el mes/año digitado.
        -> mes solo debe aceptar numeros entre 1 y 12.*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Digite el numero del mes: ");
        m = s.nextInt();
        System.out.print("Digite el año: ");
        a = s.nextInt();
        
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
            break;
            case 2:
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            break;
            default:
                System.out.println("Mes no valido");
        }
    }    
}
