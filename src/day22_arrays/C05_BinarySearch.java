package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,0,45,25,4,9,};
        int istenenSayi=5;

        istenenElemenVarmi(arr,istenenSayi);


    }

    private static void istenenElemenVarmi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenenSayi){
                sonuc=true;

                break;

            }

        }
        System.out.println(sonuc);
    }
}
