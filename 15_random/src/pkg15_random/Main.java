package pkg15_random;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //generar un numero al azar entre 11 y 53
        //instanciar un nuevo objeto de clase Random
        Random r = new Random();
        //generacion del numero al azar r.nextInt(MAX-MIN+1)+MIN
        int azar = r.nextInt(53-11+1)+11;
        System.out.println("numero generado: "+azar);
    }    
}
