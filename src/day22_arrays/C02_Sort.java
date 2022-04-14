package day22_arrays;

public class C02_Sort {
    public static void main(String[] args) {

        // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

        int arr[]= {3,5,6,1,9,0,45,25,4,9,};

        int enKucukSayi=0;
        int enBuyukSayi=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<enKucukSayi){

                enKucukSayi=arr[i];

            }
            if (arr[i]>enBuyukSayi){

            }

        }
    }
}
