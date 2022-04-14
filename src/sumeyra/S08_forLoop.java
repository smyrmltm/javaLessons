package sumeyra;

public class S08_forLoop {
    public static void main(String[] args) {
        int input=8;
        int faktoryel=1;

        for (int i = input; i >=1 ; i--) {

            faktoryel*=i;

        }
        System.out.println(input+"! ="+faktoryel);
    }
}
