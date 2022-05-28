package Questions.AssignmentsByKunal;

public class Q7 {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.

        int num = 17;
        System.out.println(isPrime(num));
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
