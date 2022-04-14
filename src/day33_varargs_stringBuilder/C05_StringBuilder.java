package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("ali can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
    }
}
