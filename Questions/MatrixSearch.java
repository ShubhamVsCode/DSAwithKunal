package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr ={
                {1 , 2  , 4 },
                {3 , 5  , 10},
                {9 , 11 , 13}
        };

        int target = 11;

        int[] ans= matrixSearch(arr,target);

        System.out.println(Arrays.toString(ans));
    }
    static int[] matrixSearch(int[][] arr, int target){
        int row=0 , col=arr[row].length - 1;

        while(row< arr.length && col>=0 ){

            if (arr[row][col] == target){
                return new int[] {row,col} ;
            }
            else if (arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }

        return new int[] {-1,-1};
    }
}
