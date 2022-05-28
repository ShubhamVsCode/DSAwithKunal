package Questions.AssignmentsByKunal;

public class Q3 {
    public static void main(String[] args) {
        // A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
        int age= -12;
        eligibleOrNot(age);

    }
    static void eligibleOrNot(int age){
        if (age<0){
            System.out.println("Enter Valid Age");
        }
        else if (age>=18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote");
        }
    }
}
