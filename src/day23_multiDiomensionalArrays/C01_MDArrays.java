package day23_multiDiomensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);

        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.deepToString(arr));
    }

}
