public class ReverseNum {
    public static void main(String[] args) {
        int number = 3545126;
        int revNumber = 0;

        while(number > 0){
            int rem = number%10;
            number = number/10;

            revNumber = revNumber*10 + rem;
        }
        System.out.println(revNumber);
    }
}
