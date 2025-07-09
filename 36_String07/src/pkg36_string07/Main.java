package pkg36_string07;
public class Main {
    public static void main(String[] args) {
        /*Metodo replace
        Devuelve una version del String donde se ha reemplazado todas las
        coincidencias de un String X dentro de un String Y
        -> Este metodo no ignora mayusculas y minusculas de forma tradicional*/
        String str = "Verde es la Manzana, la manzana es verde. Que verde es la manzana!";
        System.out.println("String original: "+str);
        //reemplazar verde por roja sin alterar al String original e imprimirlo
        System.out.println( str.replace("verde", "roja") );
        System.out.println("String original: "+str);
        //si quiere alterar el String original
        str = str.replace("verde", "roja");
        System.out.println("String original: "+str);
        
        //el replace se puede desencadenar en una sola instruccion
        String str2 = "La sandia es una fruta muy rica, el jugo de sandia es mejor que el de noni.";
        //reemplazar sandia por melon, y noni por rabano sin alterar al String original
        System.out.println( str2.replace("sandia","melon").replace("noni", "rabano") );
        //cambiar la variable original
        str2 = str2.replace("sandia","melon").replace("noni", "rabano");
        System.out.println("str2 original: "+str2);
        
        //reemplazar en JAVA ignorando mayusc./minusc.
        //se puede hacer gracias al uso de expresiones regulares (regex), el metodo
        //a usar se llama replaceAll:
        String str3 = "Rojo ROjo ROJO RoJo VERDE verdE VeRdE VERde AZul AZUL azul AzUL";
        //reemplace verde por rosa ignorando mayusculas y minusculas alterando el String original
        str3 = str3.replaceAll("(?i)verde","rosa");
        System.out.println(str3);
        
        /*Preguntar un String al usuario.
        El programa va a reemplazar en dicho String todos los espacios por guiones bajos,
        todas las letras A por 4, las letras E por 3, las letras I por 1.
        Ignorando mayusculas y minusculas además altere el String original.
        -> se le permite usar replace o replaceAll.*/
    }    
}
