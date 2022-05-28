package Questions.AssignmentsByKunal;

import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers.

        int num1 = 6;
        int num2 = 20 ;

        ArrayList<Integer> ans = primeBtnNums(num1, num2);

        System.out.println(ans);
    }

    static ArrayList<Integer> primeBtnNums(int num1  , int num2) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int number = num1; number <= num2; number++) {
            if(isPrime(number)){
                ans.add(number);
            }
        }
        return ans;
    }

    static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
