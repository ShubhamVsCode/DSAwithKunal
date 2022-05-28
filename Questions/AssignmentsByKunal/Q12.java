package Questions.AssignmentsByKunal;

public class Q12 {
    public static void main(String[] args) {
        // Write a function to check if a given triplet is a Pythagorean triplet or not.
        // (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

        int num1 = 3;
        int num2 = 5;
        int num3 = 4;

        System.out.println(pythagoreanTriplet(num1,num2,num3));

    }

    static boolean pythagoreanTriplet(int num1, int num2, int num3) {
        int aSquare = num1*num1;
        int bSquare = num2*num2;
        int cSquare = num3*num3;

        if (num1 > num2 && num1 > num3 ){
            return aSquare == (bSquare + cSquare);
        }
        else if (num2 > num1 && num2 > num3 ) {
            return bSquare == (aSquare + cSquare);
        }
        else  {
            return cSquare == (aSquare + bSquare);
        }
    }
}
