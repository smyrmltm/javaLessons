package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str= "Bugun ne cok sey ogrendik";

        // bu cumlede bosluk dısındakı karakter sayısını bulunuz

        System.out.println("space haric karakter sayisi :" +str.replace("", "").length());


        System.out.println("orjınal str karakter sayisi : " + str.length());

        str=str.replace("Bugun","yarın");
        str=str.replace("ogrendik","ogrenecegız");

        System.out.println("kalici degisiklikten sonra :" + str);

    }
}
