package day22_arrays;

import java.util.Arrays;

public class C04_TersrenSiralayipKaydetme {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,0,45,25,4,9,};

        arr=terstenSirala(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("En buyuk element : "+ arr[0]);

    }

   public static int[] terstenSirala(int[] arr) {

       Arrays.sort(arr);
       int tersArr[]= new int[arr.length];

       for (int i = 0; i <arr.length ; i++) {

           tersArr[i]=arr[arr.length-1-i];

       }
       return tersArr;

    }
}
