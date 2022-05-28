package Questions.AssignmentsByKunal;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Define a method that returns the product of two numbers entered by user.

        Scanner in = new Scanner(System.in);

        int num1= in.nextInt();
        int num2= in.nextInt();

        int ans =product(num1,num2);
        System.out.println(ans);
    }

    static int product(int num1, int num2) {
        return num1*num2;
    }

}
