public class CountNum {
    public static void main(String[] args) {
        int num = 346444549;
        // count the num of 4 in "num"
        int count = 0;

        while ( num > 0){
            int rem = num%10;
             if ( rem == 4 ){
                 count++;
             }
             num = num/10;
        }

        System.out.println(count);
    }
}
