package Questions.AssignmentsByKunal;

public class Q9 {
    // Write a program to print the factorial of a number by defining a method named 'Factorial'.
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    static int factorial(int n){
        int ans = 1;
        if (n>=2){
            ans = n*factorial(n-1);
        }
        return ans;
    }
}
