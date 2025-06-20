package pkg27_control_de_flujo;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Haga un programa que tenga una estructura while infinita,
        esta estructura en cada iteracion va a preguntar
        al usuario un numero entero secreto.
        El numero secreto se va a cambiar en cada iteracion.
        El numero secreto sera un numero al azar entre 1 y 10.
        Al finalizar el programa debera felicitar al usuario.
        -> resolverlo utilizando break.*/
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numero, secreto;
        while(true){
            secreto = r.nextInt(10-1+1)+1;
            System.out.print("Adivine el numero secreto entre 1 y 10: ");
            numero = s.nextInt();
            if( numero == secreto ) break;
        }
        System.out.println("Felicidades has escapado.");
    }
    
}
