import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int n = 7;
        int a = 0 , b = 1;

        for (int i = 2 ; i < n ; i++){
            int temp = b ;
            b = b+a ;
            a = temp;
        }
        System.out.println(b);
    }
}
