package pkg17_for1;
public class Main {
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //10 iteraciones:
        for( int i = 1; i <= 10; i++ )
            System.out.println(i);
        //10 iteraciones:
        for( int i = 0; i < 10; i++ )
            System.out.println(i+1);
        //10 iteraciones
        for( int i = 101; i <= 110; i++ )
            System.out.println(i-100);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        System.out.println("*************************");
        //26 iteraciones
        for( int i = 0; i <= 50; i = i+2 )
            System.out.println(i);
        //26 iteraciones
        System.out.println("*************************");
        for( int i = 0; i <= 50; i += 2 )
            System.out.println(i);
        //51 iteraciones
        System.out.println("*************************");
        for( int i = 0; i <= 50; i++ ){
            if( i%2 == 0 )
                System.out.println(i);
        }
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco
        System.out.println("*************************");
        //11 iteraciones
        for( int i = 0; i <= 50; i += 5 )
            System.out.println(i);
        System.out.println("*************************");
        //51 iteraciones
        for( int i = 0; i <= 50; i++ ){
            if( i%5 == 0 )
                System.out.println(i);
        }
        
        //4) recorrer los numeros del 1 al 50 pero solo imprima los pares
        System.out.println("*************************");
        //50 iteraciones
        for( int i = 1; i <= 50; i++ ){
            if( i%2 == 0 )
                System.out.println(i);
        }
        
        /*5) imprimir los numeros del 1 al 100; colocar un asterisco
        a la derecha de aquellos numeros que son multiplo de 10*/
        //forma 1:
        System.out.println("*************************");
        for( int i = 1; i <= 100; i++ ){
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        //forma 2:
        System.out.println("*************************");
        for( int i = 1; i <= 100; i++ ){
            System.out.print(i);
            if( i%10 == 0 ) System.out.print("*");
            System.out.println();
        }
        
        /*6) imprimir los numeros del 10 al 1, de forma descendente de uno en uno*/
        System.out.println("*************************");
        for(int i = 10; i > 0; i--)
            System.out.println(i);
        System.out.println("*************************");
        for(int i = 10; i >= 1; i--)
            System.out.println(i);
        System.out.println("*************************");
        for(int i = 10; i >= 1; i-=1)
            System.out.println(i);
        
        /*7) imprimir los numeros del 10 al 0,
        de forma descendente de dos en dos*/
        System.out.println("*************************");
        for(int i = 10; i >= 0; i-=2)
            System.out.println(i);
        
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        System.out.println("*************************");
        for(int i = 100; i >= 0; i-=10)
            System.out.println(i);
        
        /*La estructura for permite trabajar usando decimales
        -> imprimir los numeros del 0 al 10 en altos de 0.5*/
        System.out.println("*************************");
        for( double i = 0; i <= 10; i+=0.5 )
            System.out.println(i);
    }    
}
