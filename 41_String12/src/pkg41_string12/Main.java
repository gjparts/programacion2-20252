package pkg41_string12;
public class Main {
    public static void main(String[] args) {
        //Conversiones en JAVA
        //convertir de String a int
        String str1 = "800";
        int e1 = Integer.parseInt(str1);
        System.out.println("str1: "+str1);
        System.out.println("e1: "+e1);
        
        //convertir de String a double
        str1 = "3.14167";
        double d1 = Double.parseDouble(str1);
        System.out.println("str1: "+str1);
        System.out.println("d1: "+d1);
        
        //convertir de String a float
        str1 = "1.2345";
        float f1 = Float.parseFloat(str1);
        System.out.println("str1: "+str1);
        System.out.println("f1: "+f1);
        
        //convertir de String a long
        str1 = "1234123412345";
        long l1 = Long.parseLong(str1);
        System.out.println("str1: "+str1);
        System.out.println("l1: "+l1);
        
        //convertir desde cualquier tipo primitivo hacia String
        int e2 = 78;
        double d2 = 5.4567;
        float f2 = 3.457f;
        long l2 = 1234567890123L;
        str1 = String.valueOf(e2);
        System.out.println("e2: "+e2);
        System.out.println("str1: "+str1);
        
        str1 = String.valueOf(d2);
        System.out.println("d2: "+d2);
        System.out.println("str1: "+str1);
        
        str1 = String.valueOf(f2);
        System.out.println("f2: "+f2);
        System.out.println("str1: "+str1);
        
        str1 = String.valueOf(l2);
        System.out.println("l2: "+l2);
        System.out.println("str1: "+str1);
    }
}
