package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str= "Java ile IT cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("mehmet hoca" + str.substring(5));

        System.out.println(str.substring(9));

        System.out.println(str.substring(0,5));

        System.out.println(str.substring(0,1));

        System.out.println(str.substring(5,6));

        str="Java gun gwctikce guzellesiyor";
        System.out.println(str.substring(7,7));

        System.out.println(str.substring(str.length()-1));

        System.out.println(str.substring(str.length()-5));
        System.out.println(str.substring(str.length()));


    }
}
