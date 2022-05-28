package Questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= { 1, 2, 3, 8, 15, 26 };

        // int target= 26;
        int target = 4;

        // int ans = binarySearch(arr, target);
        int ans = ceilingOfTheNumber(arr, target);

        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target ){
        int startIndex= 0;
        int endIndex= arr.length - 1;

        while( startIndex <= endIndex ){

            int midIndex = startIndex + (endIndex-startIndex)/2;

            if( target < arr[midIndex]){
                endIndex= midIndex-1;
            } else if (target > arr[midIndex]){
                startIndex = midIndex+1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    static int ceilingOfTheNumber(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        int midIndex = 0;
        while (startIndex <= endIndex) {

            midIndex = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (target > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return arr[midIndex];
            }
        }
        return arr[startIndex];
    }
}
