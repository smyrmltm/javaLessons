package sumeyra;

import java.util.Arrays;
import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir ifade giriniz : ");

        String str=scan.nextLine();
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sayac=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i-1].equals(arr[i])){
                sayac++;

            }else{
                System.out.println(arr[i]+ "nin sayisi "+ (sayac+1));
            }

        } //if (i==arr.lengt-1)

    }



}
