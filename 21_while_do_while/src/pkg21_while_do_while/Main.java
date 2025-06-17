package pkg21_while_do_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Estructura de repeticion while y do-while
        1) Normalmente se usa cuando no sabemos el momento
           en que debemos dejar de iterar.
        2) Se basan en el cumplimiento de una o varias condiciones
        3) Si quiere entenderlas mejor, imaginelos como un if iterativo
        4) diferencias:
            -> while: pregunta primero, hace despues
            -> do-while: hace primero, pregunta despues.*/
        //ejemplos basicos:
        //programa que cuenta de 1 a 10 usando while
        int i = 1; //variable de control
        while( i <= 10 ){  //condicion(es) de cumplimiento
            System.out.println(i);
            i++;    //debe sobreescribir la variable de control para
                    //que algun dia deje de cumplirse la condicion y termine.
        }
        
        //programa que cuenta de 1 a 10 usando do-while
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j <= 10);
        
        /*Haga un programa que pregunte al usuario N cantidad
        de numeros positivos. El programa va a terminar cuando
        se digite un numero negativo.*/
        Scanner s = new Scanner(System.in);
        //usando while
        float numero = 0;
        while( numero >= 0 ){
            System.out.print("Digite numero positivo: ");
            numero = s.nextFloat();
        }
        System.out.println("**********************");
        //usando do-while
        double valor;
        //observe que no inicialice la variable la variable
        //porque do hara al menor una iteracion y ahi es donde
        //se inicializa
        do{
            System.out.print("Digite numero positivo: ");
            valor = s.nextDouble();
        }while( valor >= 0 );
    }    
}
