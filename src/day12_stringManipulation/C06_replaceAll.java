package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi yaziniz");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));
    }
}
