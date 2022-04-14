package sumeyra;

import java.util.Scanner;

public class S04_MEthodCreation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        int sayi=scan.nextInt();

        for (int i = 1; i <=10 ;i++ ) {

            System.out.println(sayi + " x " +i+" = " +sayi*i);

        }

    }
}
