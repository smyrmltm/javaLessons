package day26_forEachLoop_constructor;

public class C01_ForeachLoop {
    public static void main(String[] args) {


        int arr[]={2,4,6,8,11};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " ");


        }
        System.out.println("");

        for (int each : arr
             ) {
            System.out.print(each + " ");

        }
    }
}
