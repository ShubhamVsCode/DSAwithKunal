package Questions.AssignmentsByKunal;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number respectively
        // among three numbers entered by the user.

        int[] arr = {28 , 20 , 40};

        int[] ans =maxMinSearch(arr);
        int[] ans2 =maxMinTwo(arr);
        System.out.println(Arrays.toString(ans2));
    }

    static int[] maxMinSearch( int[] arr){
        int maxEle= arr[0];

        if (arr[1] > maxEle){
            maxEle = arr[1];
        }
        if (arr[2]> maxEle){
            maxEle = arr[2];
        }

        int minEle= arr[0];

        if (arr[1] < minEle){
            minEle = arr[1];
        }
        if (arr[2] < minEle){
            minEle = arr[2];
        }

        return new int[]{maxEle, minEle};
    }

    static int[] maxMinTwo( int[] arr){
        int max = Math.max(arr[0], Math.max(arr[1] , arr[2]));
        int min = Math.min(arr[0], Math.min(arr[1] , arr[2]));

        return new int[] {max, min};
    }
}


