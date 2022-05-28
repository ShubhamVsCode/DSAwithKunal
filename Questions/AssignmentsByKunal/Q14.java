package Questions.AssignmentsByKunal;

public class Q14 {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers.
        int ans = firstnSum(100);
        System.out.println(ans);
    }

    static int firstnSum (int n){
        if (n<1){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n + firstnSum(n-1);
    }
}
