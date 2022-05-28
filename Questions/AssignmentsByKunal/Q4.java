package Questions.AssignmentsByKunal;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Write a program to print the sum of two numbers entered by user by defining your own method.

        Scanner in = new Scanner(System.in);

        int num1= in.nextInt();
        int num2= in.nextInt();

        sum(num1,num2);
    }

    static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
