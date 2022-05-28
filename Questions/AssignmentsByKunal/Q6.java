package Questions.AssignmentsByKunal;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Write a program to print the circumference and
        // area of a circle of radius entered by user by defining your own method.

        Scanner in = new Scanner(System.in);
        int radius= in.nextInt();
        circle(radius);
    }

    static void circle(int radius) {
        System.out.println("Area of Circle : " +  Math.PI*(radius*radius));
        System.out.println("Circumference of Circle : " +  2*Math.PI*(radius));
    }

}
