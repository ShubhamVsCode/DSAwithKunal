package Questions.AssignmentsByKunal;

public class Q10 {
    // Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        int num = 15951;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {

        String stringNum = Integer.toString(num);
        int numLength = stringNum.length();
        int i=0;

        while (i <= numLength/2 ){
            char start = stringNum.charAt(i);
            char end = stringNum.charAt(numLength -i -1);

            if (start == end){
                i++;
            } else {
                return false;
            }

        }
        return true;
    }
// Processing...
    /*
    static boolean isPalindrom2(int num){

        int[] digits =new int[5];

        int digit = num%10;
        while( digit > 0 ){
            for (int i = 0; i < 5; i++) {
                    digits[i] = digit;

            }

        }

        System.out.println(digit);

        return true;
    }

     */
}
